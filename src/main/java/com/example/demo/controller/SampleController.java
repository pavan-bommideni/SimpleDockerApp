package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping(value = "/api/employees")
    public ResponseEntity<List<Employee>> getEmployeeList(){
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(), HttpStatus.OK);

    }

}
