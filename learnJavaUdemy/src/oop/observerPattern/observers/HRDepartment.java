package oop.observerPattern.observers;

import oop.observerPattern.Employee;
import oop.observerPattern.observers.IObserver;

public class HRDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("HR notified ... ");
        System.out.println(msg + " " + emp.getName());
    }
}
