package com.sample.app.microService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.app.microService.entity.Employee;
import com.sample.app.microService.repo.EmployeeRepo;

@RestController
@RequestMapping("/")
public class MyAppController {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@RequestMapping(value ="/",method=RequestMethod.GET)
    public String welcome() {//Welcome page, non-rest
        return "Welcome to My App controller.";
    }
	
	
	@GetMapping("/employees")
    public List<Employee> get() {
		
        return employeeRepo.findAll();//"Shraddha is Mad Girl  :-) and Vivek knows it well !!!";
    }
	
	@RequestMapping(value ="/create",method=RequestMethod.POST)
    public String create() {
        return "create Method";
    }

	
	
}
