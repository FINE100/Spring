package com.example.demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAjaxController {

	// Ajax에서는 내가 지정해준 타입에 따라 return 타입도 달라짐. 
	@RequestMapping("/userRegAjax")
	public void userRegAjax() {
			
	}
	
	@RequestMapping("/list")
	@ResponseBody // response contentType : json
	public Map<String,String> list() {		
		return Collections.singletonMap("name", "park");
	}
	
	// 등록처리
	@RequestMapping("/reg")
	@ResponseBody 
	public UserVO reg(UserVO vo) {
		System.out.println(vo);
		return vo;
	}
}
