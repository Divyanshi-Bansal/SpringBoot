package com.example.springBoot.dto;

public class UserDto {
	private String username;
	private String password;
	
	public UserDto() {}
	
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
	public UserDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
