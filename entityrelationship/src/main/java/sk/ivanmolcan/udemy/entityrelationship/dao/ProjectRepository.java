package sk.ivanmolcan.udemy.entityrelationship.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sk.ivanmolcan.udemy.entityrelationship.dto.ChartData;
import sk.ivanmolcan.udemy.entityrelationship.dto.ProjectProject;
import sk.ivanmolcan.udemy.entityrelationship.dto.TimeChartData;
import sk.ivanmolcan.udemy.entityrelationship.entities.Project;


import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    public List<Project> findAll();

    @Query(nativeQuery=true, value="SELECT stage as label, COUNT(*) as value " +
            "FROM project " +
            "GROUP BY stage")
    public List<ChartData> getProjectStatus();

    @Query(nativeQuery=true, value="SELECT name as projectName, start_date as startDate, end_date as endDate"
            + " FROM project WHERE start_date is not null")
    public List<TimeChartData> getTimeData();

}
