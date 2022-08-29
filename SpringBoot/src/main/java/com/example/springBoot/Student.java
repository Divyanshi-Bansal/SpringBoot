package com.example.springBoot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
	private int rollno;
	private String name;
	private Address address;
//	private String[] nicknames;
	
//	public Student(){}
	
	public Student(int rollno, String name, Address address) {
		this.rollno = rollno;
		this.name = name;
//		this.nicknames = nicknames;
		this.address = address;
	}
//
//	public String[] getNicknames() {
//		return nicknames;
//	}
//
//	public void setNicknames(String[] nicknames) {
//		this.nicknames = nicknames;
//	}
//
//	public int getRollno() {
//		return rollno;
//	}
//
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	
	
}
