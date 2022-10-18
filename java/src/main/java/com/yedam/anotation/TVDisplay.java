package com.yedam.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Bean 등록
public class TVDisplay {
	
	// tv에 대한 의존성 주입, 클래스가 여러개이면 필드 이름과 동일한 것을 찾아옴
	@Autowired 
	TV sTv;
	
	public void run() {
		this.sTv.on();
	}
}
