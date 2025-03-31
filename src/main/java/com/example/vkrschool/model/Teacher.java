package com.example.vkrschool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int empId;
	private String name;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
