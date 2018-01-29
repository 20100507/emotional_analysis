package org.bianqi.wangyi.web.es.test;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bianqi.web.wangyi.utils.ESClientUtils;
import org.bianqi.web.wangyi.utils.PageBean;
import org.bianqi.web.wangyi.utils.SearchUtils;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.cluster.node.DiscoveryNode;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.highlight.HighlightField;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ES客户端
 * <p>Title: ESClientTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月23日下午6:46:19
 * @version 1.0.0
 */
public class ESClientTest {

	private TransportClient client;
	private IndexRequest source;

	@Before
	public void before11() throws Exception {
		Settings settings = Settings.settingsBuilder().put("client.transport.ignore_cluster_name", true) // 忽略集群名字验证,
				.build();
		client = TransportClient.builder().settings(settings).build()
				.addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("192.168.254.215", 9300)));
		System.out.println("success connect");
	}
	/**
     * 查看集群信息
     */
    @Test
    public void testInfo() {
        List<DiscoveryNode> nodes = client.connectedNodes();
        for (DiscoveryNode node : nodes) {
            System.out.println(node.getHostAddress());
        }
    }
    
    
    /**
     * 组织json串, 方式1,直接拼接
     */
    public String createJson1() {
        String json = "{" +
                "\"user\":\"kimchy\"," +
                "\"postDate\":\"2013-01-30\"," +
                "\"message\":\"trying out Elasticsearch\"" +
            "}";
        return json;
    }
    
    /**
     * 使用map创建json
     */
    public Map<String, Object> createJson2() {
        Map<String,Object> json = new HashMap<String, Object>();
        json.put("user", "kimchy");
        json.put("postDate", new Date());
        json.put("message", "trying out elasticsearch");
        return json;
    }

    
    /**
     * 使用es的帮助类
     */
    public XContentBuilder createJson4() throws Exception {
        // 创建json对象, 其中一个创建json的方式
        XContentBuilder source = XContentFactory.jsonBuilder()
            .startObject()
                .field("user", "kimchy")
                .field("postDate", new Date())
                .field("message", "trying to out ElasticSearch")
            .endObject();
        return source;
    }

    @Test
    public void test1() throws Exception {
        XContentBuilder source = createJson4();
        // 存json入索引中
        IndexResponse response = client.prepareIndex("twitter", "tweet", "1").setSource(source).get();
//        // 结果获取
        String index = response.getIndex();
        String type = response.getType();
        String id = response.getId();
        long version = response.getVersion();
        boolean created = response.isCreated();
        System.out.println(index + " : " + type + ": " + id + ": " + version + ": " + created);
    }
    
    /**
     * get API 获取指定文档信息
     */
    @Test
    public void testGet() {
//        GetResponse response = client.prepareGet("twitter", "tweet", "1")
//                                .get();
        GetResponse response = client.prepareGet("log4j-2018.02.19", "log4j_type", "AWGvky2aWyh2zXt6_1Um")
                .setOperationThreaded(false)    // 线程安全
                .get();
        System.out.println(response.getSourceAsString());
    }
    
    @Test
    public void testGet1(){
    	SearchResponse response = client.prepareSearch("log4j-2018.02.19")
  			  .setTypes("log4j_type")
  			  // 设置查询类型
  			// 1.SearchType.DFS_QUERY_THEN_FETCH = 精确查询
  			// 2.SearchType.SCAN = 扫描查询,无序
  			// 3.SearchType.COUNT = 不设置的话,这个为默认值,还有的自己去试试吧
  			  .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
  			  // 设置查询关键词
  			  .setQuery(QueryBuilders.matchQuery("log4j_type.thread", "main"))
  			  .addHighlightedField("main")
  			  .setHighlighterPreTags("<em>")
  			  .setHighlighterPostTags("</em>")
  			  // 设置查询数据的位置,分页用
  			.setFrom(0)
  			// 设置查询结果集的最大条数
  			.setSize(60)
  			// 设置是否按查询匹配度排序
  			.setExplain(true)
  			// 最后就是返回搜索响应信息
  			  .execute()
  			  .actionGet();
  			SearchHits searchHits = response.getHits();
  			System.out.println("-----------------在["+"ma"+"]中搜索关键字["+"main"+"]---------------------");
  			System.out.println("共匹配到:"+searchHits.getTotalHits()+"条记录!");
  			SearchHit[] hits = searchHits.getHits();
  			for (SearchHit searchHit : hits) {
  			//获取高亮的字段
  			Map<String, HighlightField> highlightFields = searchHit.getHighlightFields();
  			HighlightField highlightField = highlightFields.get("main");
  			System.out.println("高亮字段:"+highlightField.getName()+"\n高亮部分内容:"+highlightField.getFragments()[0].string());
  			Map<String, Object> sourceAsMap = searchHit.sourceAsMap();
  			Set<String> keySet = sourceAsMap.keySet();
  			for (String string : keySet) {
  			//key value 值对应关系
  			System.out.println(string+":"+sourceAsMap.get(string));
  			}
  		}
    }
    
    @Test
    public void test4(){
    	SearchRequestBuilder responsebuilder = client.prepareSearch("twitter").setTypes("tweet") ;
    	SearchResponse myresponse=responsebuilder.setQuery(QueryBuilders.matchPhraseQuery("user", "kimchy"))  
    			.setFrom(0).setSize(10).setExplain(true).execute().actionGet();
    	SearchHits hits = myresponse.getHits();  
    	for (int i = 0; i < hits.getHits().length; i++) {  
    	           System.out.println(hits.getHits()[i].getSourceAsString());}  
     }
    
    
    @Test
    public void test5(){
        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();  
        //使用should实现或者查询  
        boolBuilder.should(QueryBuilders.matchQuery("content","爱我"));  
        //c查询  
        SearchRequestBuilder searchRequestBuilder = this.client.prepareSearch("hotcomments")  
                .setTypes("logs")  
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH) //设置查询类型：1.SearchType.DFS_QUERY_THEN_FETCH 精确查询； 2.SearchType.SCAN 扫描查询,无序  
                .setQuery(boolBuilder)  
                .setSize(10);  
   
        //设置高亮显示  
        searchRequestBuilder.setHighlighterPostTags("</span>");
        searchRequestBuilder.setHighlighterPreTags("<span style=\"color:red\">");
        searchRequestBuilder.addHighlightedField("content"); 
        //执行结果  
        SearchResponse response = searchRequestBuilder.get();  
        //接受结果  
        List<Map<String,Object>> result = new ArrayList<>();  
        //遍历结果  
        for(SearchHit hit:response.getHits()){  
            Map<String, Object> source = hit.getSource();  
            //处理高亮片段  
            Map<String, HighlightField> highlightFields = hit.getHighlightFields();  
            HighlightField nameField = highlightFields.get("content");  
            if(nameField!=null){  
                Text[] fragments = nameField.fragments();  
                String nameTmp ="";  
                for(Text text:fragments){  
                    nameTmp+=text;  
                }  
                //将高亮片段组装到结果中去  
                source.put("content",nameTmp);
            }  
            result.add(source);  
        }  
        for (Map<String, Object> map : result) {
			Set<Entry<String, Object>> entrySet = map.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				System.out.println(entry.getKey()+":::"+entry.getValue());
			}
		}
    }
    
    @Test
    public void test6() throws Exception{
    	PageBean<Map<String,Object>> searchListPageBean = new PageBean<Map<String,Object>>();
	    BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();  
	    boolBuilder.must(QueryBuilders.matchQuery("content","那就这样吧"));  
	    PageHelper.startPage(5, 3);
	    SearchRequestBuilder searchRequestBuilder = ESClientUtils.getClient().prepareSearch("hotcomments")  
	               .setTypes("logs")  
	               .setSearchType(SearchType.DFS_QUERY_THEN_FETCH) //设置查询类型：1.SearchType.DFS_QUERY_THEN_FETCH 精确查询； 2.SearchType.SCAN 扫描查询,无序  
	               .setQuery(boolBuilder)  
	               .setFrom(5)  
	               .setSize(3);
	    long totalHits = ESClientUtils.getClient().prepareSearch("hotcomments")  
	            .setTypes("logs")  
	            .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
	            .setQuery(boolBuilder)
	            .get()
	            .getHits().getTotalHits();
	       //设置高亮显示  
	       searchRequestBuilder.setHighlighterPostTags("</span>");
	       searchRequestBuilder.setHighlighterPreTags("<span style=\"color:red\">");
	       searchRequestBuilder.addHighlightedField("content");   
	       //执行结果  
	       SearchResponse response = searchRequestBuilder.get();  
	       //接受结果  
	       List<Map<String,Object>> result = new ArrayList<>();  
	       //遍历结果  
	       for(SearchHit hit:response.getHits()){  
	           Map<String, Object> source = hit.getSource(); 
	           String songName = null;
	           String songUrl = null;
	           Set<Entry<String, Object>> entrySet = source.entrySet();
	           for (Entry<String, Object> entry : entrySet) {
	        	   if(entry.getKey().equals("songId")){
	        		   Integer songId = (Integer)entry.getValue();
	        		   songName = SearchUtils.getSongNameById(songId);
	        		   songUrl = SearchUtils.getSongUrlById(songId);
	        	   }
	           }
	           source.put("songName", songName);
	           source.put("songUrl", songUrl);
	           //处理高亮片段  
	           Map<String, HighlightField> highlightFields = hit.getHighlightFields();  
	           HighlightField nameField = highlightFields.get("content");  
	           if(nameField!=null){  
	               Text[] fragments = nameField.fragments();  
	               String nameTmp ="";  
	               for(Text text:fragments){  
	                   nameTmp+=text;  
	               }  
	               //将高亮片段组装到结果中去  
	               source.put("content",nameTmp);  
	           }  
	           result.add(source);  
	       }  
	       PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(result);
	        long totalPage = (totalHits + 3 - 1) / 3;
			int pageNum = pageInfo.getPageNum();
			searchListPageBean.setPage(pageNum);
			searchListPageBean.setTotalPage(totalPage);
			searchListPageBean.setList(result);
			
			 for (Map<String, Object> map : result) {
					Set<Entry<String, Object>> entrySet = map.entrySet();
					for (Entry<String, Object> entry : entrySet) {
						System.out.println(entry.getKey()+":::"+entry.getValue());
					}
				}
    }
}












