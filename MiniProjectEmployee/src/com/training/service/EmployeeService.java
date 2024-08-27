package com.training.service;

import java.util.ArrayList;
import com.training.bean.Employee;

public interface EmployeeService {
    void addEmployee(Employee e);
    ArrayList<Employee> listEmployees();
    Employee searchEmployeeById(int empId);
    boolean deleteEmployeeById(int empId);
}
