package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.vo.Department;
import com.example.employee.vo.ResponseTemplateVO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public ResponseTemplateVO getEmployeeWithDeparment(Long employeeId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Employee employee = employeeRepository.findByEmployeedId(employeeId);
		Department department = 
				restTemplate.getForObject("http://department-service/departments/"+employee.getDepartmentId(), Department.class);
		vo.setEmployee(employee);
		vo.setDepartment(department);
		return vo;
	}
}
