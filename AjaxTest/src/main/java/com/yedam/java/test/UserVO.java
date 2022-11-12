package com.yedam.java.test;

import lombok.Data;

//Thymeleaf 실습 

@Data
public class UserVO {

	String username;

	public UserVO(String username) {
		super();
		this.username = username;
	}
}
