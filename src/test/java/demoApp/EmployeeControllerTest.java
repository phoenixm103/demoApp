package demoApp;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import demoApp.model.Employee;
import demoApp.repository.EmployeeRepository;
import demoApp.service.EmployeeService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	@Test
	public void getAllEployeeTest() {
		when(employeeRepository.findAll()).thenReturn(Stream
				.of(new Employee("0001", "Moin"), new Employee("0002", "Mahmud")).collect(Collectors.toList()));
		assertEquals(2, employeeService.getAllEmployee().size());
	}

//	@Test
//	public void addEmployeeTest() {
//		Employee employee = new Employee("0001","Moin");
//		when(employeeRepository.save(employee)).thenReturn(employee);
//		assertEquals(employee, employeeService.addEmployee(employee));
//	}

	@Test
	public void deleteUserTest() {
		Employee employee = new Employee("0001","Moin");
		employeeService.deleteEmployee(employee.getId());
		verify(employeeRepository, times(1)).deleteById(employee.getId());
	}

	
}
