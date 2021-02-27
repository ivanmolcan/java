package oop.exercise1.clients;

import oop.exercise1.domain.Employee;
import oop.exercise1.domain.Nurse;
import oop.exercise1.domain.dao.EmployeeDAO;
import oop.exercise1.reporting.EmployeeReportFormatter;
import oop.exercise1.reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee john = new Nurse(1, "John", "Nurse", true);
        ClientModule.hireNewEmployee(john);
        ClientModule.terminateEmployee(john);
        printEmployeeReport(john, FormatType.CSV);

    }

    public static void hireNewEmployee(Employee emp){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);
    }

    public static void terminateEmployee(Employee emp){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
    }

    public static void printEmployeeReport(Employee emp, FormatType form){
        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(emp, form);
        System.out.println(employeeReportFormatter.getFormattedEmployee());

    }
}
