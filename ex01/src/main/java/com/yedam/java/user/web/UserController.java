package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {
	
	@RequestMapping(value="inputForm", 
					method= {RequestMethod.POST, 
								RequestMethod.GET})
	
	public String inputForm() {
		return "inputForm"; // inputForm.jsp 호출
	}
	
	// 1) 기본적인 방법
	//@RequestMapping("users")
	//public String process(UserVO uservo) {
	
	//	System.out.println("이름 : " + uservo.getName());
	//	System.out.println("나이 : " + uservo.getAge());
	//	return ""; 
	// }

	
	
	// 2) RequestParam 이름지정하기 "name" = jsp의 name, Strig userName = java 내에서 이름 
	//	@RequestMapping("users")
	//	public String process(@RequestParam("name") String userName, 
	//							@RequestParam("age") int userAge) {
	//	System.out.println(userName + ", "+ userAge);
	//	return "";		
	// }
	
	
	// 3) Map<key : Value> 에 담아서 출력
	@RequestMapping("users")
	public String process(@RequestParam Map<String, Object> map) {
		System.out.println(map.get("name") + ", "+ map.get("age"));
		return "";		
	}
	
	
	// 4) 배열(List) 데이터 출력
//	@RequestMapping("userList")
//	public String listProcess(UserListVO userList) {
//		for(UserVO uservo : userList.getList()) {
//			System.out.println("이름 : " + uservo.getName());
//			System.out.println("나이 : " + uservo.getAge());
//		}
//		return ""; 
//	}
	
	// 5) 리스트 형태로 출력하기 (get 방식으로 바로 출력하기)
	
	@RequestMapping("nameList")
	public String listProcess(@RequestParam List<String> name) {
		for(String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	// 6) ajax로 리스트 출력해보기
	@RequestMapping(value="userList")
	public String listProcess2(@RequestBody List<UserVO> userList) {
		for(UserVO uservo : userList) {
			System.out.println("이름 : " + uservo.getName());
			System.out.println("나이 : " + uservo.getAge());
		}
		return ""; 
	}
	
}
