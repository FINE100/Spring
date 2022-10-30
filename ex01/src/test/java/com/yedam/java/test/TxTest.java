package com.yedam.java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.test.service.AaaService;

@RunWith(SpringJUnit4ClassRunner.class)// mapper가 없어서 /**/ 추가 해야함 (mapper.xml로 접근하던 database-context로 접근할 수 있도록 경로 지정)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml") 
public class TxTest {
	
	@Autowired
	AaaService service;
	
	@Test
	public void txTest() {
		//service.insert();
		service.test();
	}

}
