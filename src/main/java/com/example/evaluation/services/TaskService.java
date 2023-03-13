package com.example.evaluation.services;


import com.example.evaluation.entities.Project;
import com.example.evaluation.entities.Task;
import com.example.evaluation.entities.User;
import com.example.evaluation.repositories.ProjectRepository;
import com.example.evaluation.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



public class TaskService {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    ProjectRepository projectRepository;

    public List<Task> findAllTasks(){

        return taskRepository.findAll();
    }

    public void Create(Task task,int project_id){
        Project project=projectRepository.findById(project_id).get();
        Task task1=new Task(task.getTask_id(), task.getTitle(), task.getDescription(), project);
        taskRepository.save(task1);
    }
    public void DeleteAllTAsksByPojectId(int project_id){
        List<Task> tasks=taskRepository.findAll();
        for(Task task:tasks){
            if(task.getProject().getProject_id()==project_id)
                taskRepository.delete(task);

        }
    }
}
