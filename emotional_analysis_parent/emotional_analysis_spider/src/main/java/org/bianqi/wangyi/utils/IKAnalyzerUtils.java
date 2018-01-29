package org.bianqi.wangyi.utils;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IKAnalyzerUtils {
	
	public static void main(String[] args) {  
        String keyWord = "Java的分词效果到底怎么样呢，我们来看一下吧[抱抱]";  
        //创建IKAnalyzer中文分词对象  
        IKAnalyzer analyzer = new IKAnalyzer();  
        // 使用智能分词  
        analyzer.setUseSmart(true);  
        // 打印分词结果  
        try {  
            printAnalysisResult(analyzer, keyWord);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
	
	public static List<String> printAnalysisResult(Analyzer analyzer, String keyWord)  
            throws Exception {  
        TokenStream tokenStream = analyzer.tokenStream("content",  
                new StringReader(keyWord));
        tokenStream.reset();
        tokenStream.addAttribute(CharTermAttribute.class);
        ArrayList<String> keys = new ArrayList<>();
        while (tokenStream.incrementToken()) {  
            CharTermAttribute charTermAttribute = tokenStream  
                    .getAttribute(CharTermAttribute.class);  
            keys.add(charTermAttribute.toString());
        }  
        return keys;
    }  
}
