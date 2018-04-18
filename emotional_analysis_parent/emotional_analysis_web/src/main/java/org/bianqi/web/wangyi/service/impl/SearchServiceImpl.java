package org.bianqi.web.wangyi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.bianqi.web.wangyi.service.SearchService;
import org.bianqi.web.wangyi.utils.ESClientUtils;
import org.bianqi.web.wangyi.utils.PageBean;
import org.bianqi.web.wangyi.utils.SearchUtils;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.highlight.HighlightField;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 查询歌曲热门评论
 * <p>Title: SearchServiceImpl</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年3月16日下午10:49:35
 * @version 1.0.0
 */
@Service
public class SearchServiceImpl implements SearchService{

	@Override
	public PageBean<Map<String,Object>> getSearchResult(int page, int rows,String content) throws Exception {

		PageBean<Map<String, Object>> searchListPageBean = new PageBean<Map<String, Object>>();
		BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();
		boolBuilder.must(QueryBuilders.matchQuery("content", content));
		PageHelper.startPage(page, rows);
		SearchRequestBuilder searchRequestBuilder = ESClientUtils.getClient().prepareSearch("hotcomments")
				.setTypes("logs").setSearchType(SearchType.DFS_QUERY_THEN_FETCH) 
				.setQuery(boolBuilder).setFrom(page).setSize(3);
		long totalHits = ESClientUtils.getClient().prepareSearch("hotcomments").setTypes("logs")
				.setSearchType(SearchType.DFS_QUERY_THEN_FETCH).setQuery(boolBuilder).get().getHits().getTotalHits();
		searchRequestBuilder.setHighlighterPostTags("</span>");
		searchRequestBuilder.setHighlighterPreTags("<span style=\"color:red\">");
		searchRequestBuilder.addHighlightedField("content");
		// 执行结果
		SearchResponse response = searchRequestBuilder.get();
		// 接受结果
		List<Map<String, Object>> result = new ArrayList<>();
		// 遍历结果
		for (SearchHit hit : response.getHits()) {
			Map<String, Object> source = hit.getSource();
			String songName = null;
			String songUrl = null;
			Set<Entry<String, Object>> entrySet = source.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				if (entry.getKey().equals("songId")) {
					Integer songId = (Integer) entry.getValue();
					songName = SearchUtils.getSongNameById(songId);
					songUrl = SearchUtils.getSongUrlById(songId);
				}
			}
			source.put("songName", songName);
			source.put("songUrl", songUrl);
			// 处理高亮片段
			Map<String, HighlightField> highlightFields = hit.getHighlightFields();
			HighlightField nameField = highlightFields.get("content");
			if (nameField != null) {
				Text[] fragments = nameField.fragments();
				String nameTmp = "";
				for (Text text : fragments) {
					nameTmp += text;
				}
				// 将高亮片段组装到结果中去
				source.put("content", nameTmp);
			}
			result.add(source);
		}
		long totalPage = (totalHits + 3 - 1) / 3;
		if(page > totalPage){
			page = 1;
		}
		searchListPageBean.setPage(page);
		searchListPageBean.setTotalPage(totalPage);
		searchListPageBean.setList(result);
		return searchListPageBean;
	}

}
