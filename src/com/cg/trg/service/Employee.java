package com.cg.trg.service;

public class Employee {
	private Integer id;
	private String name;
	private String job;
	private Double salary;
	private Integer deptno;
	
	
	public Employee() {
		
	}


	public Employee(Integer id, String name, String job, Double salary, Integer deptno) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.deptno = deptno;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Integer getDeptno() {
		return deptno;
	}


	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", salary=" + salary + ", deptno=" + deptno
				+ "]";
	}
	
	
}
