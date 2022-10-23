package com.yedam.java.free;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.java.free.mapper.FBMapper;
import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class FreeMapperTest {

//		@Autowired
//		FBMapper fbMapper;
		@Autowired
		FBService fbService;
		
//		//@Test
//		public void freeBoardSelect() {
//			FBVO fbvo = fbMapper.getBoardNo();
//			assertNotNull(fbvo);
//			
//			
//		}
		
//		@PostMapping("delete") // 데이터를 담는 공간 있음 
//		@ResponseBody 
		@Test
		public void deleteBoard() {
			FBVO abc = new FBVO(); 
			abc.setBno(1);
			Map result = fbService.deleteBoardInfo(abc);
			
			int a = (int)result.get("count");
			System.out.println(a);
			System.out.println("data" + (FBVO)result.get("data"));
			
		}
}
