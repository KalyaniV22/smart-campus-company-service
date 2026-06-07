package com.companyservice.entity;

import java.util.List;

public class Student {
	
	private int id;
	
	private String name;
	
	private String branch;
	
	private float cgpa;
	
	private int no_of_backlog;
	
	private List<Company> companies;
	
	private String email;;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", cgpa=" + cgpa + ", no_of_backlog="
				+ no_of_backlog + ", companies=" + companies + ", email=" + email + "]";
	}



}
