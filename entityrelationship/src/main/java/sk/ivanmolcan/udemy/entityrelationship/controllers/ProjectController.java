package sk.ivanmolcan.udemy.entityrelationship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sk.ivanmolcan.udemy.entityrelationship.dao.EmployeeRepository;
import sk.ivanmolcan.udemy.entityrelationship.dao.ProjectRepository;
import sk.ivanmolcan.udemy.entityrelationship.entities.Employee;
import sk.ivanmolcan.udemy.entityrelationship.entities.Project;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository proRepo;

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayProjects(Model model){
        List<Project> projects = proRepo.findAll();
        model.addAttribute("projects", projects);
        return "projects/list-projects";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        model.addAttribute("project", aProject);
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("allEmployees", employees);
        return "projects/new-project";
    }

    @PostMapping("/save")
    //@RequestParam List<Long> employees
    public String createProject(Project project, Model model){
        //this should handel saving to the database...
        proRepo.save(project);

//        Iterable<Employee> chosenEmployees = empRepo.findAllById(employees);
//
//        for(Employee emp : chosenEmployees){
//            emp.setProjects(project);
//            empRepo.save(emp);
//        }
        return "redirect:/projects";
    }

}
