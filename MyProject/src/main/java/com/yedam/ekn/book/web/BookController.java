package com.yedam.ekn.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.ekn.book.service.BookService;
import com.yedam.ekn.book.service.BookVO;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	// 도서 목록 조회
	@GetMapping("booklist")
	public String selectBookList(Model model) {
		model.addAttribute("list", service.selectBookList());
		return "book/list";
		
		/* [ return "book/list" 뜻 ]  [ /WEB-INF/views/book/list ]  
		 * [ return "list" 뜻] 	[/WEB-INF/views/list ]			*/
	}
	
	// 도서등록 페이지 이동(입력폼 이동) + 현재 등록될, 예상되는 번호 
	@GetMapping("bookinsert")
	public String insertBookForm(Model model) {
		model.addAttribute("info", service.selectBookNo());
		return "book/insert";
		
		/*model.addAttribute("info", service.selectBookNo().getBookNo()); => int 타입(단일값)
		 * 인 경우 jsp에서 ${info} 로만 쓰면 됨. 
		 * model.addAttribute("info", service.selectBookNo()); => 객체 타입 인 경우
		 * jsp에서 ${info.bookNo}로 값 꺼내와야함/.
		 * */
		
	}
	
	
	// 도서정보를 DB에 등록
	@PostMapping("bookinsert")
	public String insertBookInfo(BookVO bookVO) { // jsp에서 name에 있는 값들이 다 있으니까 Vo로
		service.insertBookInfo(bookVO);
		return "redirect: booklist"; // 도서목록조회로 보내버리기 
	}
	
}
