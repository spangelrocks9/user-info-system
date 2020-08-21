package com.vastika.uis.service;

import java.util.List;

import com.vastika.uis.dao.UserDao;
import com.vastika.uis.dao.UserDaoImpl;
import com.vastika.uis.model.User;

public class UserServiceImpl implements UserService {
	
	UserDao ud = new UserDaoImpl();

	@Override
	public int saveUserInfo(User user) {
		return ud.saveUserInfo(user);
	}

	@Override
	public int updateUserInfo(User user) {
		return ud.updateUserInfo(user);
	}

	@Override
	public int deleteUserInfo(int id) {
		return ud.deleteUserInfo(id);
	}

	@Override
	public User getUserById(int id) {
		return ud.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		return ud.getAllUser();
	}

}
