package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpReqVO;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@RestController
@CrossOrigin("*") // crossOrgin 모두 허용
public class EmpRestController {

	@Autowired
	EmpService service;
	
	// 전체 조회
	@GetMapping("/emp")
	public List<EmpVO> empSelect(){
		return service.getEmpList(new EmpReqVO());
	}
	
	// 사원 조회
	@GetMapping("/emp/{employeeId}") // 경로에서 값을 가지고 옴 
	public EmpVO empFind(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);		
		return service.getEmp(empVO);
	}
	
	// 사원 등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insert(empVO);
		return empVO;
	}
	
	// 사원 수정 ( = 사원 조회와 경로 동일함, 통신 방식만 다름) 
	// 경로에서 접근하려는 사원정보, body에서 수정하려는 정보
	@PutMapping("/emp/{employeeId}") // 조회하는 방식의 pathvariable 그대로 이용, 경로를 통해 어떤 정보 업데이트 할것인지 선택, 정보 보낼땐 바디에 담음
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO){
		empVO.setEmployeeId(employeeId); //@PathVariable로 받은 정보를 empVO에  담아줘야함
		service.updateEmp(empVO); // employeeId와 업데이트 정보 두가지가 같이 들어가야함
		return empVO;
	}
	
	
	// 사원 삭제 ( = 사원 조회와 경로 동일함, 통신 방식만 다름) 
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		return empVO;
	}
	
}
