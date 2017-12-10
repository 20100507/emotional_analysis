package org.bianqi.dao;

import java.sql.Connection;

import org.bianqi.utils.DataSourceUtils;
import org.junit.Test;

public class TestC3p0 {
	
	@Test
	public void test() throws Exception{
		Connection connection = DataSourceUtils.getConnection();
		System.out.println(connection);
	}
}
