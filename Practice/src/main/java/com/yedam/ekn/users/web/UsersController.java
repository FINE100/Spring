package com.yedam.ekn.users.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.ekn.users.service.UsersService;
import com.yedam.ekn.users.service.UsersVO;

@Controller
public class UsersController {

	@Autowired
	UsersService service;
	
	@GetMapping("userslist")
	public String getUsersList(Model model){
		model.addAttribute("list", service.getUsersList());
		return "users/list";
	}
	
	// 로그인 페이지 전환
	@GetMapping("login")
	public String loginForm() {
		return "users/login";
	}
	
	// 로그인 처리 
	@RequestMapping(value="/users/login", method = RequestMethod.POST)
	public void login(UsersVO usVO, Model model, HttpSession session) throws Exception{
		
	}	

	
	
	
	//어드민 페이지 호출
	@PostMapping("admin")
	public String admin() {
		
		return "users/admin";
	}
	
}
