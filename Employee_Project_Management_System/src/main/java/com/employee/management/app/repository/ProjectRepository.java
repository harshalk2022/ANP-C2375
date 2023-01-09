package com.employee.management.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.management.app.entity.Project;

//JPA Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	// customized query using JPQL

	// JPQL query for select project using project name
	@Query("select p from Project p where p.projectName=?1")
	List<Project> getProjectByName(String projectName);

	// JPQL query for select project using project status
	@Query("select s from Project s where s.status=?1")
	List<Project> getProjectByStatus(String status);

}
