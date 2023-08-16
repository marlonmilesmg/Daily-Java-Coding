package za.co.marlonmagonjo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employeeee {
    private String name;
    private String department;
    private double salary;

    public Employeeee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employeeee> employees = new ArrayList<>();
        employees.add(new Employeeee("John", "HR", 60000));
        employees.add(new Employeeee("Jane", "HR", 65000));
        employees.add(new Employeeee("Michael", "Finance", 80000));
        employees.add(new Employeeee("Emily", "Finance", 85000));
        employees.add(new Employeeee("David", "IT", 70000));
        employees.add(new Employeeee("Sophia", "IT", 72000));

        Map<String, Employeeee> highestPaidByDepartment = new HashMap<>();

        for (Employeeee employee : employees) {
            String department = employee.getDepartment();
            if (!highestPaidByDepartment.containsKey(department) || employee.getSalary() > highestPaidByDepartment.get(department).getSalary()) {
                highestPaidByDepartment.put(department, employee);
            }
        }

        for (String department : highestPaidByDepartment.keySet()) {
            Employeeee highestPaidEmployee = highestPaidByDepartment.get(department);
            System.out.println("Department: " + department +
                    ", Highest Paid Employee: " + highestPaidEmployee.getName() +
                    ", Salary: " + highestPaidEmployee.getSalary());
        }
    }
}

