package ec.com.linkedinlearning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Steve
 */
public class C4_V4_Composition {

    static class Employee {

        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

    }

    public static void main(String[] args) {

        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x - 1;

        Function<Integer, Integer> timesTwoMinusOne
                = minusOne.compose(timesTwo);
        //timesTwo.andThen(minusOne);

        System.out.println(timesTwoMinusOne.apply(10));

        Employee[] employeesArr = {
            new Employee("John", 34, "developer", 80000f),
            new Employee("Hannah", 24, "developer", 95000f),
            new Employee("Bart", 50, "sales executive", 100000f),
            new Employee("Sophie", 49, "construction worker", 40000f),
            new Employee("Darren", 38, "writer", 50000f),
            new Employee("Nancy", 29, "developer", 75000f),};
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Function<Employee, String> getName = employee -> employee.name;
        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
        Function<String, String> uppercase = str -> str.toUpperCase();

        Function<Employee, String> getReversedUppercasedName = getName.andThen(reverse).andThen(uppercase);

        List<String> results = employees
                .stream()
                .map(getReversedUppercasedName)
                .collect(Collectors.toList());

        System.out.println(results);

        List<String> results2 = employees
                .stream()
                .map(employee -> new StringBuilder(employee.name).reverse().toString().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(results2);
    }

}
