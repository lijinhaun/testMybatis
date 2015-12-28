package com.lijinhuan.handler;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lijinhuan.model.User;
import com.lijinhuan.service.UserService;

@Controller
public class TestHandler {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("test.do")
	public String test(Map<String, Object> map){
		java.util.List<User> list = userService.findAll();
		map.put("list", list);
		return "test";
	}
	@RequestMapping("testUpdate.do")
	public void testBatchUpdate(){
		java.util.List<User> list = new ArrayList<User>();
		User user = new User(1+"","lijinhuan",20);
		User user1 = new User(2+"","aaa",20);
		User user2 = new User(3+"","test",20);
		list.add(user);
		list.add(user1);
		list.add(user2);
		userService.batchUpdate(list);
	}
	@RequestMapping("testBatchInsertAutoCreateId.do")
	public void batchInsertAutoCreateId(){
		java.util.List<User> list = new ArrayList<User>();
		User user = new User(0+"","lijinhuan",20);
		User user1 = new User(0+"","aaa",20);
		User user2 = new User(0+"","test",20);
		list.add(user);
		list.add(user1);
		list.add(user2);
		userService.batchInsertAutoCreateId(list);
	}
}
