package com.example.evaluation;

import com.example.evaluation.entities.Project;
import com.example.evaluation.entities.Task;
import com.example.evaluation.entities.User;
import com.example.evaluation.services.ProjectService;
import com.example.evaluation.services.TaskService;
import com.example.evaluation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EvaluationApplication {

    public static void main(String[] args) {
        ProjectService projectService = new ProjectService();
        TaskService taskService=new TaskService();
        UserService userService = new UserService();
        SpringApplication.run(EvaluationApplication.class, args);

        List<Project> projects= projectService.findAllProjects();
        projects.forEach(e-> System.out.println(e.getProject_id()+" --  "+e.getTitle()));

        List<User> users= userService.findAllUsers();
        users.forEach(e-> System.out.println(e.getUser_id()+" --  "+e.getName()));

        Task task=new Task (2,"do task222","task222",null);
        taskService.Create(task,1);
        taskService.DeleteAllTAsksByPojectId (1);
        userService.deleteUserById(1);
    }

}
