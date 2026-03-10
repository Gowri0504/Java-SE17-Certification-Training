import java.util.*;
import java.util.stream.Collectors;

public class p3 {
    record Employee(String name, String department, int salary) {}

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 70000),
            new Employee("Bob", "HR", 50000),
            new Employee("Charlie", "IT", 90000),
            new Employee("David", "HR", 50000),
            new Employee("Eve", "Finance", 80000)
        );

        Map<String, Optional<Employee>> topByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::department,
                Collectors.maxBy(Comparator.comparingInt(Employee::salary))
            ));

        topByDept.forEach((dept, emp) ->
            emp.ifPresent(e -> System.out.println(e.name() + " : " + e.department()))
        );
    }
}
