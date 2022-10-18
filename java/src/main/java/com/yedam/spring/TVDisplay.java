package com.yedam.spring;

public class TVDisplay {
	TV tv;
	
	public TVDisplay() {
		
	}
	
	public TVDisplay(TV selectedtv) {
		this.tv = selectedtv;
	}
	
	// bean 컨테이너 들어갈땐 tV로 해줘야함. 앞글자 자동으로 소문자 
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	public void run() {
		this.tv.on();
	}
	
}
