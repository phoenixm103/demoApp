package demoApp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee implements Serializable{
	
	@Id
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee() {
		
	}
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
