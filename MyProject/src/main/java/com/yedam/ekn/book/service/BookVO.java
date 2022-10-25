package com.yedam.ekn.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	
	private int bookNo;
	private String bookName;
	private String bookCovering;
	@DateTimeFormat(pattern = "yyyy-MM-dd") // setter 값이 yyyy-MM-dd 형식을 가져야한다는 뜻
	private Date bookDate;
	private int bookPrice;
	private String bookPublisher;
	private String bookInfo;	
	
	// 대여 관련 
	private int totalPrice;
	private int rentCount;
	
	
}
