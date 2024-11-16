package com.EmployeeDetails.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private Integer id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="number")
	private Long number;
	
	@Column(name="performance")
	private String performance;
	
	@Column(name="feedback")
	private String feedback;
	
	@Column(name="address")
	private String address;
	
	@Column(name="Org_Id")
	private String Org_Id;
	
	@Column(name="Time")
	private String Time;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", mail=" + mail + ", number=" + number + ", perfomance=" + performance + ", feedback=" + feedback
				+ ", address=" + address + ", Org_Id=" + Org_Id + ", Time=" + Time + "]";
		
			
	}
	

}
