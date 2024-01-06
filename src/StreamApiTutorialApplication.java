

import java.util.*;
import java.util.stream.Collectors;


public class StreamApiTutorialApplication {

    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(
                new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1","Project 2"))
        );

        employees.add(
                new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1","Project 3"))
        );

        employees.add(
                new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3","Project 4"))
        );

    }

    public static void main(String[] args) {
        //for each Terminal operation accept the consumer interface as input
     employees.forEach(System.out::println);
     // MAP intermediate operation after that we can perform operation accept function functional kind of the interface.
        employees.stream().map(employee -> new Employee(employee.getFirstName(),
                employee.getFirstName(),
                employee.getSalary()*2,employee.getProjects()

        ));

        //collector will be called as the new result of the stream api is not utilized

        employees.stream().map(employee -> new Employee(employee.getFirstName(),
                employee.getFirstName(),
                employee.getSalary()*2,employee.getProjects()

        )).collect(Collectors.toList());
        List<Employee> doubledSalaries = employees.stream()
                .map(employee -> new Employee(employee.getFirstName(), employee.getLastName(),
                        employee.getSalary() * 2, employee.getProjects()))
                .collect(Collectors.toList());
//filter intermediate operation
        //will perform the chain of operation
        //any operation which return the stream as a return is intermediate operation

       employees.stream().filter(employee -> employee.getSalary()>5000.0).forEach(System.out::println);



Optional<String> optional = Optional.empty();
        System.out.println(optional.get());





    }

}


