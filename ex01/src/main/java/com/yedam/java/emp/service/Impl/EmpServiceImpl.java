package com.yedam.java.emp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service("empDAO") 		// 인터페이스 구현 클래스에 선언! 
				//insert를 실행한다면 '실행'에 해당되는 부분! (요청 처리), 반드시 필요
public class EmpServiceImpl implements EmpService { 

	@Autowired
	EmpMapper empMapper;
	
	// 알고리즘적 요소가 필요할 땐 이쪽 부분 수정! 
	// 예) List 타입 출력시 for문으로 출력 
	
	@Override
	public List<EmpVO> selectAllEmp() {
		// 전체조회
		return empMapper.getEmpList();
	}

	@Override
	public EmpVO selectOneEmp(EmpVO empVO) {
		// 단건조회
		return empMapper.getEmp(empVO);
	}

	@Override
	public int insertEmpInfo(EmpVO empVO) {
		// 등록		
		return empMapper.insertEmp(empVO);
	}

	@Override
	public int updateEmpSal(int empId) {
		// 수정
		return empMapper.updateEmpSalary(empId);
	}

	@Override
	public int deleteEmpInfo(int empId) {
		// 삭제
		return empMapper.deleteEmpInfo(empId);
	}

}
