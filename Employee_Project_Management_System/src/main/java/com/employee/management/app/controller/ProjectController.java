package com.employee.management.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.app.entity.Project;
import com.employee.management.app.service.ProjectService;

@RestController
// Rest controller to handle all incoming request using REST API
public class ProjectController {

	@Autowired
	ProjectService projectService;

	// Saving Project details using Post Mapping
	@PostMapping("/projects")
	public ResponseEntity<Project> saveProject(@Valid @RequestBody Project project) {
		return new ResponseEntity<Project>(projectService.saveProject(project), HttpStatus.CREATED);
	}

	// fetching all Project details using Get Mapping
	@GetMapping("/projects")
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}

	// fetching Project details by pId using Get Mapping
	@GetMapping("/projects/{pId}")
	public ResponseEntity<Project> getProject(@PathVariable("pId") long pId) {
		return new ResponseEntity<Project>(projectService.getProjectById(pId), HttpStatus.OK);
	}

	// Updating Project details by pId using Put mapping
	@PutMapping("/projects/{pId}")
	public ResponseEntity<Project> updateProject(@PathVariable("pId") long pId, @RequestBody Project project) {
		return new ResponseEntity<Project>(projectService.updateProjectById(project, pId), HttpStatus.OK);
	}

	// Deleting Project details by pId using Delete Mapping
	@DeleteMapping("/projects/{pId}")
	public ResponseEntity<String> deleteProject(@PathVariable("pId") long pId) {
		projectService.deleteProjectById(pId);
		return new ResponseEntity<String>("The project was successfully deleted.", HttpStatus.OK);
	}

	// fetching project details by projectName using Get Mapping
	@GetMapping("/projects/pname/{projectName}")
	public List<Project> getPByName(@PathVariable("projectName") String projectName) {
		return projectService.getProjectByName(projectName);
	}

	// fetching Employee details by status using Get Mapping
	@GetMapping("/projects/status/{status}")
	public List<Project> getPByStatus(@PathVariable("status") String status) {
		return projectService.getProjectByStatus(status);
	}
}
