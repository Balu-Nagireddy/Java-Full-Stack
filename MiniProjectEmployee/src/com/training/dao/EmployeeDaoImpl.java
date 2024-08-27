package com.training.dao;

import java.util.ArrayList;
import java.util.HashMap;
import com.training.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    private HashMap<Integer, Employee> employeeMap;

    public EmployeeDaoImpl() {
        employeeMap = new HashMap<>();
    }

    @Override
    public void addEmployee(Employee e) {
        employeeMap.put(e.getEmpId(), e);
    }

    @Override
    public ArrayList<Employee> listEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee searchEmployeeById(int empId) {
        return employeeMap.get(empId); // Returns the Employee object if found, otherwise returns null
    }

    @Override
    public boolean deleteEmployeeById(int empId) {
        if (employeeMap.containsKey(empId)) {
            employeeMap.remove(empId);
            return true; // Employee deleted successfully
        }
        return false; // Employee not found
    }
}
