package com.surya;

import java.util.Date;

//enity class
public class Manager {

	//indtance var
	private int User_id;
	private String User_name;
	private Date Joining_date;
	private String Discripton;

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getUser_name() {
		return User_name;
	}
	

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public Date getJoining_date() {
		return Joining_date;
	}

	public void setJoining_date(Date joining_date) {
		Joining_date = joining_date;
	}

	public String getDiscripton() {
		return Discripton;
	}

	public void setDiscripton(String discripton) {
		Discripton = discripton;
	}

}
