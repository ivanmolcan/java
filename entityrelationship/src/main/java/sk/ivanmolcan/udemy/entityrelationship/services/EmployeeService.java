package sk.ivanmolcan.udemy.entityrelationship.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.ivanmolcan.udemy.entityrelationship.dao.EmployeeRepository;
import sk.ivanmolcan.udemy.entityrelationship.dao.ProjectRepository;
import sk.ivanmolcan.udemy.entityrelationship.dto.EmployeeProject;
import sk.ivanmolcan.udemy.entityrelationship.entities.Employee;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepo;


    public Employee save(Employee employee) {
        return empRepo.save(employee);
    }


    public Iterable<Employee> getAll() {
        return empRepo.findAll();
    }


    public List<EmployeeProject> employeeProjects() {
        return empRepo.employeeProjects();
    }


    public Employee findByEmployeeId(long theId) {
        // TODO Auto-generated method stub
        return empRepo.findByEmployeeId(theId);
    }


    public void delete(Employee theEmp) {
        empRepo.delete(theEmp);

    }
}
