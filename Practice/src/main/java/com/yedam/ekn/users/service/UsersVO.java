package com.yedam.ekn.users.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UsersVO {
	
	private String userId;
	private String userName;
	private String userPassword;
	private String userNic;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date userDate;
	private String userPhone;
	private String userEmail;
	private String userType;
	private String userAuthor; 
}
