package com.employee.management.app.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.employee.management.app.entity.Project;
import com.employee.management.app.repository.ProjectRepository;
import com.employee.management.app.service.ProjectService;

// Testing all CRUD method of Project Service
@SpringBootTest
public class ProjectServiceTest {

	@Autowired
	private ProjectService projectService;

	@MockBean
	private ProjectRepository projectRepository;

	// testing saveProject() of Project service
	@Test
	public void testSaveProject() {
		Project project = new Project();
		project.setPId(1);
		project.setProjectName("Website redesign project");
		project.setDescription(
				"To improve the user experience, increase customer engagement, and boost conversions by redesigning an existing website.");
		project.setStartDate("10-10-2022");
		project.setEndDate("10-12-2022");
		project.setBudget(230000);
		project.setStatus("active");

		Mockito.when(projectRepository.save(project)).thenReturn(project);
		assertThat(projectService.saveProject(project)).isEqualTo(project);
	}

	// testing getAllProjects() of Project service
	@Test
	public void testGetAllProjects() {

		// Creating project 1 object and adding values in it
		Project project1 = new Project();
		project1.setPId(1);
		project1.setProjectName("Employee training program");
		project1.setDescription(
				"To improve employee skills, knowledge, and performance through structured training and development activities.");
		project1.setStartDate("10-10-2022");
		project1.setEndDate("10-12-2022");
		project1.setBudget(230000);
		project1.setStatus("active");

		// Creating project 2 object and adding values in it
		Project project2 = new Project();
		project2.setPId(1);
		project2.setProjectName("Marketing campaign project");
		project2.setDescription(
				"To raise awareness of a product or service, increase sales, and build brand loyalty through targeted marketing efforts.");
		project2.setStartDate("10-10-2022");
		project2.setEndDate("10-12-2022");
		project2.setBudget(230000);
		project2.setStatus("active");

		List<Project> Projects = List.of(project1, project2);

		Mockito.when(projectRepository.findAll()).thenReturn(Projects);
		assertThat(projectService.getAllProjects()).isEqualTo(Projects);
	}

	// testing getProjectById() of Project service
	@Test
	public void testGetProjectById() {
		Project project = new Project();
		project.setPId(2);
		project.setProjectName("Website redesign project");
		project.setDescription(
				"To improve the user experience, increase customer engagement, and boost conversions by redesigning an existing website.");
		project.setStartDate("10-10-2022");
		project.setEndDate("10-12-2022");
		project.setBudget(230000);
		project.setStatus("active");

		Optional<Project> optional = Optional.of(project);
		Project pro = optional.get();

		Mockito.when(projectRepository.findById((long) 2)).thenReturn(optional);
		assertThat(projectService.getProjectById(2)).isEqualTo(pro);
	}

	// testing testUpdateProjectById() of Project service
	@Test
	public void testUpdateProjectById() {
		Project project = new Project();
		project.setPId(2);
		project.setProjectName("Website redesign project");
		project.setDescription(
				"To improve the user experience, increase customer engagement, and boost conversions by redesigning an existing website.");
		project.setStartDate("10-10-2022");
		project.setEndDate("10-12-2022");
		project.setBudget(230000);
		project.setStatus("active");

		Optional<Project> optional = Optional.of(project);
		Project pro = optional.get();

		Mockito.when(projectRepository.findById((long) 2)).thenReturn(optional);

		// updated project budget and status
		pro.setBudget(270000);
		pro.setStatus("completed");

		Mockito.when(projectRepository.save(pro)).thenReturn(pro);
		assertThat(projectService.updateProjectById(pro, 2)).isEqualTo(pro);
	}

	// testing DeleteProjectById() of Project service
	@Test
	public void testDeleteProjectById() {
		Project project = new Project();
		project.setPId(2);
		project.setProjectName("Website redesign project");
		project.setDescription(
				"To improve the user experience, increase customer engagement, and boost conversions by redesigning an existing website.");
		project.setStartDate("10-10-2022");
		project.setEndDate("10-12-2022");
		project.setBudget(230000);
		project.setStatus("active");

		Optional<Project> optional = Optional.of(project);

		Mockito.when(projectRepository.existsById((long) 2)).thenReturn(false);
		assertThat(projectRepository.existsById(optional.get().getPId()));
	}
}
