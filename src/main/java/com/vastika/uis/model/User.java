package com.vastika.uis.model;

import java.util.Date;

public class User {


		private int id;
		private String username;
		private String password;
		private String email;
		private Long mobileNo;
		private Date dob;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(Long mobileNo) {
			this.mobileNo = mobileNo;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

}
