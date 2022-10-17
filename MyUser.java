package com.gl.LoginAuthentication.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class MyUser extends User{
	@Id
	private String userId;
	private String userPass;
	public MyUser() {
		super("Marigold","Mango",new ArrayList<>());
	}
	public MyUser(String userId, String userPass,Collection<? extends GrantedAuthority> authorities,String userId2,String userPass2) {
		super(userId,userPass,authorities);
		userId=userId2;
		userPass=userPass2;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	@Override
	public String toString() {
		return " " + userId + " " + userPass;	}
	
}
