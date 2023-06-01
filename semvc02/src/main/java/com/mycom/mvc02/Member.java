package com.mycom.mvc02;

public class Member {
	private String userid;
	private String usernum;
	private String userpass;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsernum() {
		return usernum;
	}

	public void setUsernum(String usernum) {
		this.usernum = usernum;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", usernum=" + usernum + ", userpass=" + userpass + "]";
	}

}
