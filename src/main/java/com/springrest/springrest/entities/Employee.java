package com.springrest.springrest.entities;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	@Autowired
	private long id;
	private String title;
	private String desc;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String title, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + ", desc=" + desc + "]";
	}

}
