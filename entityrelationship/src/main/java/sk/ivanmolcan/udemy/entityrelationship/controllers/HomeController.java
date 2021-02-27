package sk.ivanmolcan.udemy.entityrelationship.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sk.ivanmolcan.udemy.entityrelationship.dao.EmployeeRepository;
import sk.ivanmolcan.udemy.entityrelationship.dao.ProjectRepository;
import sk.ivanmolcan.udemy.entityrelationship.dto.EmployeeProject;
import sk.ivanmolcan.udemy.entityrelationship.dto.ProjectProject;
import sk.ivanmolcan.udemy.entityrelationship.entities.Employee;
import sk.ivanmolcan.udemy.entityrelationship.entities.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    //odkaz na property v applic.properties
//    @Value("${version}")
//    private String ver;

    @Autowired
    ProjectRepository proRepo;

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping("/")
    //Model model sluzi na vratenie udajov z view
    public String displayHome(Model model) throws JsonProcessingException {

        //prehodi data do view
        model.addAttribute("versionNumber", ver);

        Map<String, Object> map = new HashMap<>();

        List<Project> projects = proRepo.findAll();
        model.addAttribute("projectsList", projects);

        //Lets convert projectData object into a json structure for use in javascript
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(projectData);

        model.addAttribute("projectStatusCnt", jsonString);

        List<EmployeeProject> employeesProjectCount = empRepo.employeeProjects();
        model.addAttribute("employeesListProjectsCnt", employeesProjectCount);

        return "main/home";
    }
}

//http://localhost:8080/h2-console
//jdbc url   jdbc:h2:mem:testdb
//use a redirect to prevent duplicate submissions
