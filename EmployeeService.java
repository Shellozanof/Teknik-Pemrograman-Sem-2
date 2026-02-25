package id.ac.polban.employee.service;

import java.util.HashMap;
import java.util.Map;
import id.ac.polban.employee.model.*;

public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();
    
    private static int totalEmployees = 0;

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
        totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            double newSalary = emp.getSalary() * (1 + percent / 100);
            emp.setSalary(newSalary);
        }
    }
}