package demoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demoApp.model.Employee;
import demoApp.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEployee(){
		return employeeService.getAllEmployee();
	}
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable String id) {
		employeeService.updateEmployee(employee,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}
	@RequestMapping("/test")
	public String test(){
		return "Tested Positive";
	}
	
}
