package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private MyUserRepository myUserRepository;

    public User saveUser(User user) {
       return myUserRepository.save(user);
    }

    public void deleteUser(User user) {
        myUserRepository.delete(user);
    }

    public List<User> findAllUsers(){
        return myUserRepository.findAll();
    }

}
