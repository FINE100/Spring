package com.yedam.java.product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	//등록 페이지 이동(입력폼 + 상품 번호 예상)
	@GetMapping("insert")
	public String insertProductForm(Model model) {
		model.addAttribute("info", service.getProductId());
		return "product/insert";
	}
	
	//DB 등록
	@PostMapping("insert")
	public String insertProductInfo(ProductVO productVO) {
		service.insertProduct(productVO);
		return "redirect: list"; // 상품조회/수정페이지로

	}
	
	
	// 상품조회/수정 
	@GetMapping("list")
	public String getProductList(Model model) {
		model.addAttribute("list", service.getProductList());
		return "product/list";
	}
		
}
