package com.yedam.java.product.mapper;

import java.util.List;

import com.yedam.java.product.service.ProductVO;

public interface ProductMapper {
	
	//상품번호 조회
	public ProductVO getProductId();
	// 상품 등록
	public int insertProduct(ProductVO productVO);
	// 상품 전체 조회
	public List<ProductVO> getProductList();
	

}
