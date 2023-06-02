package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.entity.Employee;

import java.util.List;

//import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}