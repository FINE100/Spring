package com.yedam.java.test.service.impl;
/*트랜잭션은 AOP 기반이므로 인터페이스가 필요함. 
 * (AOP가 인터페이스 기반으로 위빙이 걸리기 때문에)*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.java.test.mapper.AaaMapper;
import com.yedam.java.test.service.AaaService;

@Service
public class AaaServiceImpl implements AaaService {
	
	@Autowired
	AaaMapper mapper;
	
	@Transactional // 비지니스 메서드 (serviceImpl)에 붙임. 트랜잭션 어노테이션으로 묶으면 오류 났을 때 다 안들어감. 공통으로 묶여서 가기 때문에, 
	@Override
	public void insert() {
		mapper.insert("101"); // 각각 commit;
		mapper.insert("값"); // 각각 rollback;
		
	}

	@Override
	public void test() {
		this.insert();
		
	}
	
	
	
}
