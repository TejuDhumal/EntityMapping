package com.dev2prod.springdatajpamappings.service;

import com.dev2prod.springdatajpamappings.entity.Employee;
import com.dev2prod.springdatajpamappings.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> findEmployee() {
        return employeeRepository.findAll();
    }

    public ResponseEntity<String> addEmployee(List<Employee> empData) {
         employeeRepository.saveAll(empData);
         return ResponseEntity.ok("data saved");
    }
}
