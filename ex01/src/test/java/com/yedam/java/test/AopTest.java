package com.yedam.java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.test.service.Cats;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AopTest {
	@Autowired
	Cats myCat;
	
	//@Test
	public void aopTest() {
		myCat.getName();
		System.out.println("=========================");
		System.out.println("1)");
		String catName = myCat.getName(); //AOP가 걸려 있으므로 Log 출력 됨 
		
		System.out.println("\n2)");
		System.out.println(catName); //AOP가 걸려 있지 않아서 본인 것만 출력하고 끝
	}
	
	@Test
	public void aopTest2() {
		myCat.printInfo(); // printInfo()는 this = 본인자신(구현클래스)로 구현되므로 AOP 생성 안됨. 
						   // AOP는 인터페이스를 기반으로한 그림자 클래스로 돌아가는 것.
		System.out.println("======================");
		myCat.printData();
	}
}
	

