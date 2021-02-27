package sk.ivan.molcan.generics;

import sk.ivan.molcan.generics.Employee;

import java.util.ArrayList;
import java.util.*;

public class Container2 {

    public static void main(String[] args) {

        Object myObject = new Object();

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<>();
        employees2 = accountants2;

        //pre potomka
        //Upper bound
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<>();
        employees3 = accountants3;

        //Bud to je Employee alebo parent of employee. Preventing subclasses to create
        //Lower bound
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Object> accountants4 = new ArrayList<>();
        employees4 = accountants4;

        makeEmployeeWork(employees);
        makeEmployeeWork(accountants);
    }

    public static void makeEmployeeWork(List<? extends Employee> employees){
        for(Employee emp: employees){
            emp.work();
        }
    }

//    public static void makeEmployeeWork(List<? extends Employee> employees){
//        for(Accountant emp: (ArrayList<Accountant>)employees){
//            emp.work();
//        }
//    }

}
