package demoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demoApp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
