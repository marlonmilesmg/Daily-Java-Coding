package za.co.marlonmagonjo;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Collectors -
 *      toList()
 *      toSet()
 *      toMap(keyMapper, valueMapper)
 *
 *      groupingBy(Function)
 *          - grouping stream of elements using a function into a Map
 *
 *      groupingBy(Function, Collector)
 *          - grouping stream of elements using a function into a Map
 *          - reduction is performed on each group using the downstream collector
 *
 */

class Employee {
    private int id;
    private String name;
    private double score;

    public Employee(int id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class StreamCollectors {
    public static void main(String[] args) {
        Stream<Employee> employeeStream =
                Stream.of(new Employee(2, "b", 93),
                        new Employee(1, "a", 87),
                        new Employee(3, "c", 91));

        // Map<Integer, Employee>
        Map<Integer, Employee> employeeMap = employeeStream
                .collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println(employeeMap);
        System.out.println("===================================================");

        Stream<Employee> employeeStream1 =
                Stream.of(new Employee(2, "b", 93),
                        new Employee(1, "a", 87),
                        new Employee(3, "c", 87));

        // Group employees by score
        Map<Double, List<Employee>> employeeMap1 = employeeStream1
                .collect(Collectors.groupingBy(Employee::getScore));

        System.out.println(employeeMap1);
        System.out.println("======================================================");

        Stream<Employee> employeeStream2 =
                Stream.of(new Employee(2, "b", 93),
                        new Employee(1, "a", 87),
                        new Employee(3, "c", 87));

        // Count of employees per score
        Map<Double, Long> employeeMap3 = employeeStream2
                .collect(Collectors.groupingBy(Employee::getScore, Collectors.counting()));

        System.out.println(employeeMap3);
    }
}
