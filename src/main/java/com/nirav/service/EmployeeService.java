package com.nirav.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.nirav.model.Employee;

@Service
public class EmployeeService {
	
	public List<Employee> getEmployeeData(){
		List<Employee> lstEmployee = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setSalary(5000);
		employee.setName("Nirav");
		employee.setSurname("Raval");
		employee.setDesignation("Team Leader");
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setSalary(5000);
		employee2.setName("Vishal");
		employee2.setSurname("Patel");
		employee2.setDesignation("Tech Leader");
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setSalary(5000);
		employee3.setName("Rishit");
		employee3.setSurname("Patel");
		employee3.setDesignation("Manager");
		
		lstEmployee.add(employee);
		lstEmployee.add(employee2);
		lstEmployee.add(employee3);
		
		return lstEmployee;
	}
}
