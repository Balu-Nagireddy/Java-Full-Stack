package com.training.service;

import java.util.ArrayList;
import com.training.bean.Employee;
import com.training.dao.EmployeeDao;
import com.training.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void addEmployee(Employee e) {
        employeeDao.addEmployee(e);
    }

    @Override
    public ArrayList<Employee> listEmployees() {
        return employeeDao.listEmployees();
    }

    @Override
    public Employee searchEmployeeById(int empId) {
        return employeeDao.searchEmployeeById(empId);
    }

    @Override
    public boolean deleteEmployeeById(int empId) {
        return employeeDao.deleteEmployeeById(empId);
    }
}
