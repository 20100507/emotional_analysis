package org.bianqi.follower;

import java.io.IOException;

import org.junit.Test;

/**
 * <p>Title: FollowerTest</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年10月25日下午1:10:43
 * @version 1.0.0
 */
public class FollowerTest {
	
	/**
	 * 粉丝 但是数据使用JS解析 是个问题
	  //TODO
	 * <p>Title: test3</p>
	 * <p>Description: </p>
	 * @throws IOException
	 */
	@Test
	public void test3() throws IOException{
			int songId = 63650;
			int pageNum = 0;
			String req_str = "{\"ids\":\"["+songId+"]\",\"offset\":"+pageNum+",\"br\":128001,\"csrf_token\":\"\"};"; 
	}
	
}
