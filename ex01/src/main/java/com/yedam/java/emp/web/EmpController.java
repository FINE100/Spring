package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;


@Controller
public class EmpController {
	
	@Autowired
	EmpService empService; // service 등록. 필드명 empDAO는 EmpServiceImpl의 @Service 이름임
	
	@RequestMapping("/allList") //post
	public String getEmpList(Model model) { 	
		model.addAttribute("empInfoList", 
								empService.selectAllEmp());
		return "emp/empList"; 
	}
	
	
	// run한 후에 주소창에 [http://localhost:8081/java/allList?msg=HelloWorld] 하면 HelloWorld 출력됨
	
	
	@GetMapping("/info") //post
	public String getEmpInfo(EmpVO empVO, Model model) {
			EmpVO findEmp = empService.selectOneEmp(empVO);
			model.addAttribute("empInfo", findEmp);
		return "emp/empInfo";
	}
	
	
	// insert
	// 등록페이지는 컨트롤러가 2개 필요함. 보여주는 용도, 데이터 등록 용도
	
	@GetMapping("insertForm") //get
	public String printInsertForm() {		
		return "emp/insertForm";
	}
	
	@PostMapping("insert")
	public String empInsert(EmpVO empVO, RedirectAttributes ratt) {
		// 커멘드 객체 이용, form으로 보냄
		int result = empService.insertEmpInfo(empVO);
		if(result == 1) {
			ratt.addFlashAttribute("msg", "정상적으로 등록되었습니다."); //addFlashAttribute : 일반적인 방식으로 값 꺼내오기 어려움
		}else {
			ratt.addAttribute("msg","등록실패! 확인해주세요~!");
		}
		
		return "redirect:allList";
	}
	
	//updateEmpSal
	
	@PostMapping("updateSal")
	public String empUpdateSal(@RequestParam int employeeId, RedirectAttributes ratt) {
		int result = empService.updateEmpSal(employeeId);
		if(result == 1) {
			ratt.addFlashAttribute("msg", "정상적으로 처리되었습니다."); //addFlashAttribute : 일반적인 방식으로 값 꺼내오기 어려움
		}else {
			ratt.addAttribute("msg","처리실패! 확인해주세요~!");
		}
		
		return "redirect:allList";
	}
	
	//delete
	// Get 방식에 데이터를 담아서 보내주는 방식({empId}를 담아서 보냄
	@GetMapping("delete/{empId}") // 필드에 담기는 것이 아니라 empId, employeeId 어떤 걸 써도 무방
	@ResponseBody //(***) 주의 깊게 볼 것!! requestParam은 키를 붙여서 보내야함. @ResponseBody는 붙이지 않아도 됨.
	public String empDelete(@PathVariable int empId) {
		
		int result = empService.deleteEmpInfo(empId);
		String message = null;
		if(result == 1) {
			message = "사원번호: " + empId + "가 삭제되었습니다.";
		}else {
			message = "삭제 실패! 확인해주세요~!";
		}
		return message;
	}
	
	
	
}
