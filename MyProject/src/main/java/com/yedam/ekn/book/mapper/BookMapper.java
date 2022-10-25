package com.yedam.ekn.book.mapper;

import java.util.List;

import com.yedam.ekn.book.service.BookVO;

public interface BookMapper {
	// 전체 조회
	public List<BookVO> getBookList(); 	
	//번호 조회
	public BookVO getBookNo();
	// 등록
	public int insertBook(BookVO bookVO);
	// 대여현황
	public BookVO getRentalInfo();
}
