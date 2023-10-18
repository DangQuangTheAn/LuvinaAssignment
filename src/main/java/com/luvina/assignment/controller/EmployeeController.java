package com.luvina.assignment.controller;

import com.luvina.assignment.entities.Employee;
import com.luvina.assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee newEmployee) {
        Employee savedEmployee = employeeService.saveEmployee(newEmployee);
        return ResponseEntity.ok(savedEmployee);
    }
}
