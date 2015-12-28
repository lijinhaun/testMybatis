package com.lijinhuan.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lijinhuan.dao.UserDao;
import com.lijinhuan.mapper.UserMapper;
import com.lijinhuan.model.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private UserMapper userMapper;
	
	public void batchInsert(List<User> list) {
		userMapper.batchInsert(list);
	}

	public void batchUpdate(List<User> list) {
		userMapper.batchUpdate(list);
	}

	public void batchInsertAutoCreateId(List<User> list) {
		userMapper.batchInsertAutoCreateId(list);
	}

	public List<User> findAll() {
		return userMapper.findAll();
	}

}
