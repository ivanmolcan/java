package oop.observerPattern.observers;

import oop.observerPattern.Employee;

public interface IObserver {

    public void callMe(Employee emp, String msg);

}
