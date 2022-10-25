package com.yedam.ekn.users.service;

import java.util.List;

public interface UsersService {
	public List<UsersVO> getUsersList(); // 전체 조회
	public UsersVO getUser(UsersVO usVO);	// 단건 조회
	
}
