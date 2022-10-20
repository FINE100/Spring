package com.yedam.java.emp.service;

import java.util.List;

//Service : insert를 실행한다면 '실행'에 해당되는 부분! (요청 처리), 반드시 필요

public interface EmpService {
	// 전체조회
	public List<EmpVO> selectAllEmp();
	// 단건조회
	public EmpVO selectOneEmp(EmpVO empVO);
	// 등록
	public int insertEmpInfo(EmpVO empVO);
	// 수정
	public int updateEmpSal(int empId);
	// 삭제
	public int deleteEmpInfo(int empId);
}
