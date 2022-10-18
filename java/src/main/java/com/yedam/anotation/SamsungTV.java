package com.yedam.anotation;

import org.springframework.stereotype.Component;

// 한개일때는 이름 안써도 됨. 클래스 여러개일땐 등록시 이름 씀
@Component("sTV")
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("어노테이션 사용");

	}

}
