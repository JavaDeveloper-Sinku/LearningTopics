package Lamda;

import java.util.Arrays;
import java.util.List;

class  Employee{
    String name;
    Double Salary;

    public Employee(String name, Double salary) {
        this.name = name;
        Salary = salary;
    }
}
public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee > employees = Arrays.asList(
                new Employee("rishi ", 20000.),
                new Employee("Java ", 254534556.0),
                new Employee("C++ ", 204234234.),
                new Employee("Python ",204234324.),
                new Employee("AI ", 200243223.)

        );
        employees.sort((e1, e2) ->
                Double.compare(e2.Salary,e1.Salary));

        employees.forEach( e ->
                System.out.println(e.name + " -> "+ e.Salary));

    }
}
