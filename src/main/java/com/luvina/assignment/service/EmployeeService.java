package com.luvina.assignment.service;

import com.luvina.assignment.repository.EmployeeRepository;
import com.luvina.assignment.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
