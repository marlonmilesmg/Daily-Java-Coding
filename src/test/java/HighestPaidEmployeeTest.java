import org.junit.Test;
import za.co.marlonmagonjo.Employeeee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HighestPaidEmployeeTest {

    @Test
    public void testHighestPaidEmployee() {
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

        // Assuming the expected values based on the provided data
        assertEquals("HR", highestPaidByDepartment.get("HR").getDepartment());
        assertEquals("Jane", highestPaidByDepartment.get("HR").getName());
        assertEquals(65000, highestPaidByDepartment.get("HR").getSalary(), 0.001);

        assertEquals("Finance", highestPaidByDepartment.get("Finance").getDepartment());
        assertEquals("Emily", highestPaidByDepartment.get("Finance").getName());
        assertEquals(85000, highestPaidByDepartment.get("Finance").getSalary(), 0.001);

        assertEquals("IT", highestPaidByDepartment.get("IT").getDepartment());
        assertEquals("Sophia", highestPaidByDepartment.get("IT").getName());
        assertEquals(72000, highestPaidByDepartment.get("IT").getSalary(), 0.001);
    }
}

