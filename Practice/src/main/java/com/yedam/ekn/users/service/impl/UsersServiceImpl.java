package com.yedam.ekn.users.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.ekn.users.mapper.UsersMapper;
import com.yedam.ekn.users.service.UsersService;
import com.yedam.ekn.users.service.UsersVO;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersMapper mapper;

	
	@Override
	public List<UsersVO> getUsersList() {
		// 전체조회
		return mapper.getUsersList();
	}


	@Override
	public UsersVO getUser(UsersVO usVO) {
		// 단건조회
		return mapper.getUser(usVO);
	}



}
