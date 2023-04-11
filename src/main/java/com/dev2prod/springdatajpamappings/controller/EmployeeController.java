package com.dev2prod.springdatajpamappings.controller;

import com.dev2prod.springdatajpamappings.entity.Employee;
import com.dev2prod.springdatajpamappings.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
          employeeService.addEmployee(empData);
         return ResponseEntity.ok("Data saved successfully");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return employeeService.findEmployee();
    }
}
