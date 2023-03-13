package com.example.evaluation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NamedNativeQuery(name="Project.save", query="INSERT INTO project (project_id, title, description) VALUES (:project_id, :title, :description)")
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;
    @Column
    private  String title;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(targetEntity = Task.class, mappedBy = "project",cascade = CascadeType.ALL)
    private List<Task> tasks;
}
