package oop.observerPattern.observers;

import oop.observerPattern.Employee;
import oop.observerPattern.observers.IObserver;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Payrol notified ... ");
        System.out.println(msg + " " + emp.getName());
    }
}
