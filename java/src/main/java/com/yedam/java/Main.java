package com.yedam.java;

public class Main {

	// 자바 방식으로 인터페이스 구현 -> 메서드 실현
	public static void main(String[] args) {
	
		TV tv = new SamsungTV();
		tv.on();
		
		
		TVDisplay td = new TVDisplay(new SamsungTV());
		td.tvOn();

	}

}
