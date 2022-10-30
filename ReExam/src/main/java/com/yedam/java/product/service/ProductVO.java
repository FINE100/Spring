package com.yedam.java.product.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ProductVO {
	
	private int productId; // 상품ID
	private String productName; // 이름
	private int  productPrice; // 단가
	private String productInfo; // 상품정보
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date productDate; // 등록일자
	private String company; // 공급업체
	private String managerId; // 담당자
	
	//조회 시 사용
	private String managerName; // 담당자 이름
	
	
}
