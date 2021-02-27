package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import sk.ivanmolcan.udemy.entityrelationship.EntityrelationshipApplication;
import sk.ivanmolcan.udemy.entityrelationship.dao.ProjectRepository;
import sk.ivanmolcan.udemy.entityrelationship.entities.Project;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ContextConfiguration(classes = EntityrelationshipApplication.class)
//@DataJpaTest
@SpringBootTest(classes = EntityrelationshipApplication.class)
@RunWith(SpringRunner.class)
@SqlGroup({@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:schema.sql", "classpath:data.sql"}),
       @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:schema.sql")})
public class ProjectRepositoryIntegrationTest {

    @Autowired
    ProjectRepository proRepo;

    @Test
    public void ifNewProjectSaved_thenSuccess(){
        Project newProject = new Project("New Test Project", "Complete", "Test description");
        proRepo.save(newProject);

        assertEquals(5, proRepo.findAll().size());
    }

}
