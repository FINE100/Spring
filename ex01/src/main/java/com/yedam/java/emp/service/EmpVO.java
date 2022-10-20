package com.yedam.java.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	// 기존 : yyyy/MM/dd -> 변경 : yyyy-MM-dd (왜? 한국이라.. 기존 형식과 다름)
	@DateTimeFormat(pattern ="yyyy-MM-dd") // 빠지면 오류남! 꼭 적기
	private Date hireDate; // java.util.Date import 해야함. 주의
	private String jobId;
	private double salary; // salary(8,2) : 소수점 존재하므로 double
	private double commisionPct; // commision_pct(2,2) : 소수점 존재하므로 double
	private int managerId;
	private int departmentId;
}
