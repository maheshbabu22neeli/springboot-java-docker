package com.learning.docker.springbootjavadocker.controller;

import com.learning.docker.springbootjavadocker.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    public static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/employee/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("empId") final String empId){
        LOGGER.info("Trying to retrieve Employee with Id {}", empId);

        Map<String, Employee> employeeList = getAllEmployees();
        Employee employee = employeeList.get(empId);

        ResponseEntity<Employee> responseEntity = new ResponseEntity<>(employee, HttpStatus.OK);
        return responseEntity;
    }


    public Map<String, Employee> getAllEmployees() {
        Employee employee1 = new Employee("001", "Mahesh Babu Neeli");
        Employee employee2 = new Employee("002", "Gopi Molabanti");
        Employee employee3 = new Employee("003", "Balu Aggala");
        Employee employee4 = new Employee("004", "Kalyan Neeli");

        Map<String, Employee> employeeList = new HashMap<>();
        employeeList.put("001", employee1);
        employeeList.put("002", employee2);
        employeeList.put("003", employee3);
        employeeList.put("004", employee4);

        return employeeList;
    }


}
