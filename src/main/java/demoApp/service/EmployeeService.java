package demoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demoApp.model.Employee;
import demoApp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;


	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
		
	}


	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);	
		
	}


	public void updateEmployee(Employee employee, String id) {
		employeeRepository.save(employee);
		
	}


	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}




}