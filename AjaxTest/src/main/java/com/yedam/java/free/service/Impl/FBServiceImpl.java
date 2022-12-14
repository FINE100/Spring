package com.yedam.java.free.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.free.mapper.FBMapper;
import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

@Service
public class FBServiceImpl implements FBService {
	
	
	@Autowired
	FBMapper fbMapper; // mybatis 가 imple 실현시켜주므로.. ! 인터페이스 역할

	@Override
	public int getBoardNo() {
		/* 방법1)
		 * FBVO fbVO = fbMapper.getBoardNO();
		 * int bno = fbVO.getBno();
		 * return bno;
		 * */ 
		
		//방법2)
		return fbMapper.getBoardNo().getBno();
	}

	@Override
	public List<FBVO> selectBoardList() {
		
		return fbMapper.getBoardList();
	}

	@Override
	public FBVO selectBoardInfo(FBVO fbVO) {
	
		return fbMapper.getBoardInfo(fbVO);
	}

	@Override
	public Map insertBoardInfo(FBVO fbVO) {		
		Integer count = fbMapper.insertBoard(fbVO);
		return getResult(count, fbVO);
	}

	@Override
	public Map updateBoardInfo(FBVO fbVO) {
		Integer count = fbMapper.updateBoard(fbVO);
		return getResult(count, fbVO);
	}

	@Override
	public Map deleteBoardInfo(FBVO fbVO) {
		int count = fbMapper.deleteBoard(fbVO.getBno());
		return getResult(count, fbVO);
	}
	
	public Map getResult(int count, FBVO fbVO) {
		Map<String, Object> result = new HashMap<String, Object>() ;
		result.put("result", count);
		result.put("data", fbVO);
		return result; // key : result, data
	}

}
