package com.employee.management.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.app.entity.Project;
import com.employee.management.app.exception.ProjectNotFoundException;
import com.employee.management.app.repository.ProjectRepository;
import com.employee.management.app.service.ProjectService;

@Service
// Implement all CRUD methods, all business logic
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	// Saving Project details into table using save() of JPA Repository
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	// fetching all Projects from table using findAll() of JPA Repository
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	// fetching Project from table based on pId using findById() of JPA Repository
	// If Project not found then throw exception
	public Project getProjectById(long pId) {
		return projectRepository.findById(pId)
				.orElseThrow(() -> new ProjectNotFoundException("The Project ID you entered does not exist."));
	}

	@Override
	// Updating Project details based on pId from table using save()
	public Project updateProjectById(Project project, long pId) {

		Project updateProject = projectRepository.findById(pId)
				.orElseThrow(() -> new ProjectNotFoundException("The Project ID you entered does not exist."));

		// Setting new values
		updateProject.setProjectName(project.getProjectName());
		updateProject.setDescription(project.getDescription());
		updateProject.setStartDate(project.getStartDate());
		updateProject.setEndDate(project.getEndDate());
		updateProject.setBudget(project.getBudget());
		updateProject.setStatus(project.getStatus());
		updateProject.setEmployee(project.getEmployee());

		// Saving updated Project Details
		projectRepository.save(updateProject);
		return updateProject;
	}

	@Override
	// Delete Project Based on pId using deleteById() of JPA Repository
	public void deleteProjectById(long pId) {
		projectRepository.findById(pId)
				.orElseThrow(() -> new ProjectNotFoundException("The Project ID you entered does not exist."));
		projectRepository.deleteById(pId);
	}

	@Override
	// fetching Project details from table based on projectName
	public List<Project> getProjectByName(String projectName) {
		return projectRepository.getProjectByName(projectName);
	}

	@Override
	// fetching Project details from table based on status
	public List<Project> getProjectByStatus(String status) {
		return projectRepository.getProjectByStatus(status);
	}

}
