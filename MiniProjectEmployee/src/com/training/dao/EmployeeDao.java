package com.training.dao;

import java.util.ArrayList;
import com.training.bean.Employee;

public interface EmployeeDao {
    void addEmployee(Employee e);
    ArrayList<Employee> listEmployees();
    Employee searchEmployeeById(int empId);
    boolean deleteEmployeeById(int empId);
}
