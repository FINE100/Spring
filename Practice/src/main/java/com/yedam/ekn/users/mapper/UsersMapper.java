package com.yedam.ekn.users.mapper;

import java.util.List;

import com.yedam.ekn.users.service.UsersVO;

public interface UsersMapper {

	public List<UsersVO> getUsersList(); // 전체 조회
	public UsersVO getUser(UsersVO usVO);			// 단건 조회
	
}
