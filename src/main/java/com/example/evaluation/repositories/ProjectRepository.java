package com.example.evaluation.repositories;

import com.example.evaluation.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
    Project save(@Param("project_id") int project_id,@Param("title") String title,@Param("description") String description);
}
