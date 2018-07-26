package com.lanou.dao;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.lanou.entity.User;

public interface UserMapper {
	
	public List<User> selectAll();
			
}
