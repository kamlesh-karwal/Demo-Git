package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("UserDao");
	}

	public String findName(int id) {
		if (id == 10) {
			return "Ram";

		} else {
			return "Sita";
		}
	}
}
