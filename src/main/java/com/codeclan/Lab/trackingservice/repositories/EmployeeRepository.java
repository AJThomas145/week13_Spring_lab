package com.codeclan.Lab.trackingservice.repositories;

import com.codeclan.Lab.trackingservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
