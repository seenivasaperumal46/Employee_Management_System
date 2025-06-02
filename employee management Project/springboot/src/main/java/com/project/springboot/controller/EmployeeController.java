package com.project.springboot.controller;

import com.project.springboot.exception.ResourceNotFoundException;
import com.project.springboot.model.Employee;
import com.project.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

        @Autowired
        private EmployeeRepository employeeRepository;

        @GetMapping
        public List<Employee> getAllEmployees(){
            return employeeRepository.findAll();
        }

        //build create employee REST API
        @PostMapping
        public Employee createEmployee(@RequestBody Employee employee){
                return  employeeRepository.save(employee);
        }

        //build get employee by id REST API
        // build get employee by id REST API
        @GetMapping("{id}")
        public ResponseEntity<Employee> getEmployeeById(@PathVariable  long id){
                Employee employee = employeeRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
                return ResponseEntity.ok(employee);
        }

        //build update employee RESTAPI;
        @PutMapping("{id}")
        public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails){
                Employee updateEmployee = employeeRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Employee not Exist with id: " +id));

                updateEmployee.setFirstName(employeeDetails.getFirstName());
                updateEmployee.setLastName(employeeDetails.getLastName());
                updateEmployee.setEmailId(employeeDetails.getEmailId());

                employeeRepository.save(updateEmployee);

                return ResponseEntity.ok(updateEmployee);
        }

        //build delete employee RESTAPI;
        @DeleteMapping("{id}")
        public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
                Employee employee =employeeRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: "+id));

                employeeRepository.delete(employee);

                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
}
