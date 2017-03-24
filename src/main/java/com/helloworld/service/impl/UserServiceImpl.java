package com.helloworld.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.helloworld.dao.IUserDao;
import com.helloworld.pojo.User;
import com.helloworld.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDao mUserDao;
	
	public User getUserById(int userId) {
		return mUserDao.selectByPrimaryKey(userId);
	}

	public void updateUser(User user) {
		mUserDao.updateByPrimaryKey(user);
	}

}
