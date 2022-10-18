package com.yedam.java;



/*생성자 혹은 메소드 추가 하지 않으면 
 * NullPointerException 에러남
 * 클래스를 어떻게 사용할지 명시하는 것 => 의존성
 */

public class TVDisplay {
	TV tv;
	
	// 생성자
	public TVDisplay(TV tv) {
		this.tv = tv;
	}
	
	// 메소드(setter) 이용
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	
	public void tvOn() {
		this.tv.on();
	}
}
