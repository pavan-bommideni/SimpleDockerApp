package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService implements IEmployeeService {

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setId(1L);
        emp1.setName("Pavan");
        Employee emp2 = new Employee();
        emp2.setId(2L);
        emp2.setName("Kumar");
        employees.add(emp1);
        employees.add(emp2);
        return employees;
    }
}
