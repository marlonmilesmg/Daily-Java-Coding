package za.co.marlonmagonjo;

public class Employeeee {
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