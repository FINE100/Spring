package com.yedam.java.user.service;

import java.util.List;

import lombok.Data;

// 데이터가 배열일때 VO
@Data
public class UserListVO {
	private List<UserVO> list;
}
