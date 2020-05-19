package com.sample.app.microService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	
	@Id
	@Column(name = "Id")
	private int Id;
	@Column(name = "emp_Name")
	private String empName;
	@Column(name = "dept_Name")
	private String deptName;
	
	
	
	
	public Employee() {
		
	}
	
	public Employee(String empName, int Id, String deptName) {
		super();
		this.empName = empName;
		this.Id = Id;
		this.deptName = deptName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id =Id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
