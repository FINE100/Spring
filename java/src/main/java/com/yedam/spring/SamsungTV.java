package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("스프링 방식으로");
	}

}
