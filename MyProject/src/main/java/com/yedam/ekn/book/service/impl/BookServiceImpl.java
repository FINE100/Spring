package com.yedam.ekn.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.ekn.book.mapper.BookMapper;
import com.yedam.ekn.book.service.BookService;
import com.yedam.ekn.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper mapper;

	@Override
	public List<BookVO> selectBookList() {		
		return mapper.getBookList();
	}

	@Override
	public BookVO selectBookNo() {		
		return mapper.getBookNo();
	}

	@Override
	public int insertBookInfo(BookVO bookVO) {
		return mapper.insertBook(bookVO);
	}

}
