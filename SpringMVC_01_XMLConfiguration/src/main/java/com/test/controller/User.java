package com.test.controller;

public class User {
	private String name;
	private Integer id;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
