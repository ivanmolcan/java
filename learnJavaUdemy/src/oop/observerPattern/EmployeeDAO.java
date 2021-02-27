package oop.observerPattern;

import java.util.*;

public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", null, 5000, false);
    Employee emp2 = new Employee("Steve", null, 4500, false);
    Employee emp3 = new Employee("John", null, 7000, false);
    Employee emp4 = new Employee("Suzy", null, 6000, false);
    Employee emp5 = new Employee("Lucy", null, 8000, false);

    List<Employee> employees;

    public List<Employee> generateEmployees(){
        employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;
    }
}
