package oop.observerPattern;

import java.util.Date;

public class Employee {

    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean fired = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, boolean fired) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.fired = fired;

        employeeID = ++COUNTER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", fired=" + fired +
                '}';
    }
}
