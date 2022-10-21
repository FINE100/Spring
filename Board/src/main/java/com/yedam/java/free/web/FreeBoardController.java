package com.yedam.java.free.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

@Controller
@RequestMapping("freeBoard") 
// 웹사이트 규모가 크면 controller 단위로 Mapping 이름을 지정, 경로를 만들어 관리함. 
// 대신 내부에서 어떤 통신 방법 선택할지 모르기 때문에 통신 방법은 채택 못함
// 예) www.naver.com/shopping/selectProdeuct, www.naver.com/blog/insertBoard.. (카테고리가 생기니 관리 편함~!) 
public class FreeBoardController {
	@Autowired
	FBService fbService;
	
	// 등록 (controller 2개 동작)	
	// 등록 - 폼(get)
	@GetMapping("insert") //  Model - 데이터 넘기기 위해서, 클래스 하나만 사용 가능
	public String insertForm(Model model) {
		model.addAttribute("no", fbService.getBoardNo()); // 게시글 번호 조회 할 수 있도록 데이터 넘겨주기 
		return "freeBoard/insertForm";
	}
	
	// 등록 - DB insert(post)  
	@PostMapping("insert") // 같은 경로더라도 통신 방법이 다르면 사용 가능함. 폼과 등록을 같은 경로 이름으로 하면 한페이지 안에서 다 처리되는 것처럼 보임(사용자)  
	public String insertFreeBoard(FBVO fbVO, RedirectAttributes ratt) {
		Map<String,Object> result = fbService.insertBoardInfo(fbVO);
		ratt.addFlashAttribute("msg", result.get("result") + "건이 등록 되었습니다.");
		return "redirect:list"; /* 상대경로로 보내고 있음. = 같은 클래스(freeBoard)안에서 돌면서 재요청(redirect)하는 것이므로...
								  /list 와 다른 결과값! 주의하기*/ 
	}
	// 전체조회
	@GetMapping("list")
	public String selectFreeBoardList(Model model) {// ,@RequestParam(required = false) String msg 
		model.addAttribute("boardList", fbService.selectBoardList()); 		// 있을 수도 있고 없을 수도 있으면 required = false
		return "freeBoard/boardList";
	}
	// 단건조회
	@GetMapping("info")
	public String selectBoardInfo(FBVO fbVO, Model model) {
		model.addAttribute("board", fbService.selectBoardInfo(fbVO));
		return "freeBoard/boardInfo";
	}
	// 수정 - 폼
	// 수정 - DB update 
	
	// 삭제
	
	
}
