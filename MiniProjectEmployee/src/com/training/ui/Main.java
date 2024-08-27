package com.training.ui;

import java.util.Scanner;
import com.training.bean.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeServiceImpl();
        int choice;

        do {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employee");
            System.out.println("3. Search EmployeeById");
            System.out.println("4. Delete EmployeeById");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(id, name, salary);
                    employeeService.addEmployee(employee);
                    break;
                case 2:
                    System.out.println("List of Employees:");
                    for (Employee emp : employeeService.listEmployees()) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee foundEmployee = employeeService.searchEmployeeById(searchId);
                    if (foundEmployee != null) {
                        System.out.println("Employee Found: " + foundEmployee);
                    } else {
                        System.out.println("Employee not found with ID: " + searchId);
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean isDeleted = employeeService.deleteEmployeeById(deleteId);
                    if (isDeleted) {
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Employee not found with ID: " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
