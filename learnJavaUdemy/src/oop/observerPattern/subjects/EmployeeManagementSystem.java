package oop.observerPattern.subjects;

import oop.observerPattern.Employee;
import oop.observerPattern.EmployeeDAO;
import oop.observerPattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private List<Employee> employees;

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    private Employee employee;
    private String msg;

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(IObserver departments: observers){
            departments.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp){
        employees = new ArrayList<>();
        employee = emp;
        msg = "New Hire ";
        employees.add(emp);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String newName){
        boolean notify = false;

        for(Employee emp: employees){
            if(id == emp.employeeID){
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
            if(notify){
                notifyObservers();
            }
        }
    }

}
