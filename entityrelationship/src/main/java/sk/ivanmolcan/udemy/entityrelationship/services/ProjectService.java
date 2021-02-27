package sk.ivanmolcan.udemy.entityrelationship.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.ivanmolcan.udemy.entityrelationship.dao.ProjectRepository;
import sk.ivanmolcan.udemy.entityrelationship.dto.ChartData;
import sk.ivanmolcan.udemy.entityrelationship.dto.TimeChartData;
import sk.ivanmolcan.udemy.entityrelationship.entities.Project;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository proRepo;


    public Project save(Project project) {
        return proRepo.save(project);
    }


    public List<Project> getAll() {
        return proRepo.findAll();
    }

    public List<ChartData> getProjectStatus(){
        return proRepo.getProjectStatus();
    }


    public List<TimeChartData> getTimeData(){
        return proRepo.getTimeData();
    }
}
