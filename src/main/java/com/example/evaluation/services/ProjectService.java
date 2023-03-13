package com.example.evaluation.services;

import com.example.evaluation.entities.Project;
import com.example.evaluation.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> findAllProjects(){

        return projectRepository.findAll();
    }
    public void save(Project project){
        projectRepository.save(project);
    }


}
