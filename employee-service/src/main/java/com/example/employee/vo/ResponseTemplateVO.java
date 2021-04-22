package com.example.employee.vo;

import com.example.employee.entity.Employee;

public class ResponseTemplateVO {

	private Employee employee;
	private Department department;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ResponseTemplateVO(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	public ResponseTemplateVO() {
		
	}

}
