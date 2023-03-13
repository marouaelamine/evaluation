package com.example.evaluation.services;

import com.example.evaluation.entities.User;
import com.example.evaluation.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUserById(int id){
        userRepository.deleteById(id);
    }
}
