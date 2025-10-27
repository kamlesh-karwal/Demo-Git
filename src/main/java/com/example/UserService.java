package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
@Autowired
private UserDao userDao;

public UserService() {
	System.out.println("UserService");
}

public void getName(int id) {
	String find  = userDao.findName(id);
	System.out.println("Name"+find);
}
}
