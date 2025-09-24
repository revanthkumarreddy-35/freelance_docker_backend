package com.freelancer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freelancer.Entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
