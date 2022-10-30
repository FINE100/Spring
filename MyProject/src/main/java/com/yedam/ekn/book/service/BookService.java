package com.yedam.ekn.book.service;

import java.util.List;

public interface BookService {
	// 전체 조회
	public List<BookVO> selectBookList();
	// 번호 조회
	public BookVO selectBookNo();
	// 등록
	public int insertBookInfo(BookVO bookVO);
	
	
	// mapper을 따로 만들었더라도 동일 기능으로 돌아간다면 
	// 굳이 따로 서비스 만들지 않아도 됨. (mapper와 service는 1:1 이 아님) 
	
}
