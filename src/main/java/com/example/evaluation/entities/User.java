package com.example.evaluation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column
    private String name;
    @Column
    private String mail;

    @OneToMany(targetEntity = Project.class, mappedBy = "user",cascade = CascadeType.ALL)
    private List<Project> projects;

}
