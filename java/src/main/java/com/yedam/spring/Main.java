package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx 
			= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TV tv = (TV)ctx.getBean("tv"); // object 타입이라 형변환 일어나야함
		tv.on();
		
		TVDisplay td = (TVDisplay)ctx.getBean("td");
		td.run();
	}

}
