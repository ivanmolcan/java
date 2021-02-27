package oop.observerPattern;

import oop.observerPattern.observers.HRDepartment;
import oop.observerPattern.observers.IObserver;
import oop.observerPattern.observers.PayrollDepartment;
import oop.observerPattern.subjects.EmployeeManagementSystem;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        EmployeeManagementSystem emp = new EmployeeManagementSystem();
        IObserver hr = new HRDepartment();
        IObserver pat = new PayrollDepartment();

        emp.registerObserver(hr);
        emp.registerObserver(pat);


        Employee bob = new Employee("Bob", new Date(), 3500, true);
        emp.hireNewEmployee(bob);
        emp.modifyEmployeeName(6, "Imtiaz");

    }
}
