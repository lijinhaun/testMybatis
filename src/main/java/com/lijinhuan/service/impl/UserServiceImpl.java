package com.lijinhuan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lijinhuan.dao.UserDao;
import com.lijinhuan.model.User;
import com.lijinhuan.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public void batchInsert(List<User> list) {
		userDao.batchInsert(list);
	}

	public void batchUpdate(List<User> list) {
		userDao.batchUpdate(list);
		
	}

	public void batchInsertAutoCreateId(List<User> list) {
		userDao.batchInsertAutoCreateId(list);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

}
