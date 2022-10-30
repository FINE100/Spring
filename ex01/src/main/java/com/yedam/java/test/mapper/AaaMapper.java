package com.yedam.java.test.mapper;

import org.apache.ibatis.annotations.Insert;

public interface AaaMapper {
	// mybatis가 제공하는 annotation. 간단한 SQL문 바로 작성 가능  
	
	@Insert("INSERT INTO AAA VALUES (#{value})") 
	public void insert(String value);
	
	
}
