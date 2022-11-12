package com.yedam.java.free;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {

	@Test
	public void test() {
		BCryptPasswordEncoder enco = new BCryptPasswordEncoder();
		String pass = enco.encode("1111");
		System.out.println(pass);	// 출력될 때마다 값 변경됨 (암호화 패스워드)
		System.out.println(enco.matches("1111", pass)); // true
	}
}
