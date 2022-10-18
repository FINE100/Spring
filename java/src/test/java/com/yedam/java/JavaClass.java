package com.yedam.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JavaClass {
	
	@Test
	public void javaTest() {
		TV tv = new SamsungTV();
		assertNotNull(tv);
	}
}
