package oop.exercise1.reporting;

import oop.exercise1.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee emp, FormatType formatType) {
        super(emp, formatType);
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}
