package com.employee.management.app.service;

import java.util.List;

import com.employee.management.app.entity.Project;

// Abstract method for performing CRUD on entity Project
public interface ProjectService {

	// Method to save Project Details
	Project saveProject(Project project);

	// Method to fetch All Projects
	List<Project> getAllProjects();

	// Method to fetch Project details using pId
	Project getProjectById(long pId);

	// Method to update Project details based on pId
	Project updateProjectById(Project project, long pId);

	// Method to delete Project based on pId
	void deleteProjectById(long pId);

	// Method to fetch Project Details using projectName
	List<Project> getProjectByName(String projectName);

	// Method to fetch Project Details using status
	List<Project> getProjectByStatus(String status);

}
