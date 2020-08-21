package com.vastika.uis.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.vastika.uis.model.User;
import com.vastika.uis.service.UserService;
import com.vastika.uis.service.UserServiceImpl;

public class UserController {

	UserService us = new UserServiceImpl();

	public void saveUserInfo(Scanner input) {

		User user = getUserData(input);

		int saved = us.saveUserInfo(user);
		if (saved >= 1) {
			System.out.println("user info inserted successfully!");
		} else {
			System.out.println("error in db.");
		}

	}

	public void updateUserInfo(Scanner input) {
		
		User user = getUserData(input);
		System.out.println("Enter user id : ");
		int id = input.nextInt();
		
		user.setId(id);
		int saved = us.updateUserInfo(user);
		if (saved >= 1) {
			System.out.println("user info updated successfully!");
		} else {
			System.out.println("error in db.");
		}
	}

	public void deleteUserInfo(Scanner input) {
		int id = input.nextInt();
		us.deleteUserInfo(id);
	}

	public void getUserInfo(Scanner input) {
		System.out.println("Enter user id : ");
		int id = input.nextInt();
		User user = us.getUserById(id);
		System.out.println("User id is: " + user.getId());
		System.out.println("User name is: " + user.getUsername());
		System.out.println("User password is: " + user.getPassword());
		System.out.println("User email is: " + user.getEmail());
		System.out.println("User mobile no is: " + user.getMobileNo());
		System.out.println("User dob is: " + user.getDob());
	}

	public void getAllUser() {
		List<User> userList = us.getAllUser();
		for (User user : userList) {
			System.out.println("User id is: " + user.getId());
			System.out.println("User name is: " + user.getUsername());
			System.out.println("User password is: " + user.getPassword());
			System.out.println("User email is: " + user.getEmail());
			System.out.println("User mobile no is: " + user.getMobileNo());
			System.out.println("User dob is: " + user.getDob());
			System.out.println("=========================");
		}
	}

	private User getUserData(Scanner input) {
		User user = new User();

		System.out.println("Enter Username : ");
		String username = input.nextLine();

		System.out.println("Enter Password : ");
		String password = input.nextLine();

		System.out.println("Enter Email : ");
		String email = input.nextLine();

		System.out.println("Enter Date of Birth : ");
		String dob = input.nextLine();

		System.out.println("Enter Mobile Number : ");
		Long mobileNo = input.nextLong();

		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setMobileNo(mobileNo);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date d = sdf.parse(dob);
			user.setDob(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return user;
	}
}
