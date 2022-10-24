package com.yedam.java.test.service;

import org.aspectj.lang.ProceedingJoinPoint;


// advisor
public class LogAop {

	public Object loggerAOP(ProceedingJoinPoint joinpoint) throws Throwable { // 예외는 던져버리겠다~~! catch 대신 throws
		// AOP가 적용되는 메서드의 정보(이름)을 가져옴
		String sigautreStr = joinpoint.getSignature().toString(); // 메서드, 매개변수...등 객체형태로 가져옴
		System.out.println("시작 : " + sigautreStr);				  // 여기만 수정되면 구현 클래스에 모두 반영됨. 일종의 다형성.

		// 공통기능
		System.out.println("핵심기능 전에 실행할 공통 기능 : " + System.currentTimeMillis()); // 로그 남기기

		try {
			Object obj = joinpoint.proceed(); // 핵심 기능 실행
			return obj;
		} finally {
			System.out.println("핵심 기능 후에 실행할 공통 기능 : " + System.currentTimeMillis());
			System.out.println("끝 : " + sigautreStr);
		}

	}
}
/* 핵심 기능, 공통 기능 모두 내가 직접 제어할 수 있음 */ 
