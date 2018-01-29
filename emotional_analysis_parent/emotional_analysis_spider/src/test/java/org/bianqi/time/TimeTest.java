package org.bianqi.time;

import java.util.Date;

import org.junit.Test;

public class TimeTest {

	@Test
	public void test1(){
		Date date = new Date();
		date.setTime(549298800000L);
		String string = date.toString();
		System.out.print(string);
	}
}
