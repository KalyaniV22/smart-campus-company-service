package com.companyservice.dto;

import java.util.List;

public class StudentDto {

	private String name;
	private String branch;
	private float cgpa;
	private int no_of_backlog;
	private String email;
	
	private List<Integer> companiesid;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public int getNo_of_backlog() {
		return no_of_backlog;
	}

	public void setNo_of_backlog(int no_of_backlog) {
		this.no_of_backlog = no_of_backlog;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Integer> getCompaniesid() {
		return companiesid;
	}

	public void setCompaniesid(List<Integer> companiesid) {
		this.companiesid = companiesid;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", branch=" + branch + ", cgpa=" + cgpa + ", no_of_backlog=" + no_of_backlog
				+ ", email=" + email + ", companiesid=" + companiesid + "]";
	}




}
