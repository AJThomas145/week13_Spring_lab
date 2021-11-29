package com.codeclan.Lab.trackingservice;

import com.codeclan.Lab.trackingservice.models.Employee;
import com.codeclan.Lab.trackingservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrackingserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Andy", 38, 12345, "myemail@email.com");
		Employee employee2 = new Employee("Simon", 42, 67899, "hisemail@email.com");
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}

}
