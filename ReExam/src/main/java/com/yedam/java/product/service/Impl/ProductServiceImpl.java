package com.yedam.java.product.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.product.mapper.ProductMapper;
import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper mapper;
	
	@Override
	public ProductVO getProductId() {
		// 상품번호 증가
		return mapper.getProductId();
	}

	@Override
	public int insertProduct(ProductVO productVO) {
		// 상품 등록
		return mapper.insertProduct(productVO);
	}

	@Override
	public List<ProductVO> getProductList() {
		// 상품 리스트 조회
		return mapper.getProductList();
	}

}
