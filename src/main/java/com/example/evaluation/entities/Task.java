package com.example.evaluation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;
    @Column
    private String title;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

}
