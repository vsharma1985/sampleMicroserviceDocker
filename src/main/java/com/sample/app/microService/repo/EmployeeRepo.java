package com.sample.app.microService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.app.microService.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	

}
