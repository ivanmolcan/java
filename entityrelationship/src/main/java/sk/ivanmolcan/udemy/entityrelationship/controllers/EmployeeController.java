package sk.ivanmolcan.udemy.entityrelationship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.ivanmolcan.udemy.entityrelationship.dao.EmployeeRepository;
import sk.ivanmolcan.udemy.entityrelationship.entities.Employee;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayEmployees(Model model){
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("employees", employees);
        return "employees/list-employee";
    }

    @GetMapping("/new")
    public String displayEmployeeForm(Model model){
        Employee emp = new Employee();
        model.addAttribute("employee", emp);
        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee emp, Model model){
        empRepo.save(emp);
        return "redirect:/employees/new";
    }
}
