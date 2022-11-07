package com.yedam.java.product.service;

import java.util.List;

public interface ProductService {
	//상품번호 조회
		public ProductVO getProductId();
		// 상품 등록
		public int insertProduct(ProductVO productVO);
		// 상품 전체 조회
		public List<ProductVO> getProductList();
		

}
