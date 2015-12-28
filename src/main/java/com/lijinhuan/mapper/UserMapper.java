package com.lijinhuan.mapper;

import java.util.List;

import com.lijinhuan.model.User;

public interface UserMapper {

	public void batchInsert(List<User> list);
	public void batchUpdate(List<User> list);
	public void batchInsertAutoCreateId(List<User> list);
	public List<User> findAll();
}
