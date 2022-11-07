package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@RestController
@CrossOrigin("*")
public class EmpRestController {
	
	@Autowired
	EmpService service;
	
	// 전체 조회
	@GetMapping("/emp")
	public List<EmpVO>empSelect(){
		return service.selectAllEmp();
	}
	
	// 사원 조회
	@GetMapping("/emp/{employeeId}")
	public EmpVO empFind(@PathVariable int employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.selectOneEmp(empVO);
	
	}
	
	//사원 등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmpInfo(empVO);
		return empVO;
	}
	// 사원 정보 수정
	
	
	
	// 사원 삭제
	
	

}
