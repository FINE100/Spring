package com.yedam.java.emp.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate; // java.util.Date import 해야함. 주의
	private String jobId;
	private double salary; // salary(8,2) : 소수점 존재하므로 double
	private double commisionPct; // commision_pct(2,2) : 소수점 존재하므로 double
	private int managerId;
	private int departmentId;
}
