package com.example.demo18.Service;

import com.example.demo18.Model.User;
import com.example.demo18.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class UserService
    {

        @Autowired
        private UserRepo userRepo;

        public List<User> getUser()
        {
            return userRepo.findAll();
        }

        public void saveUser(User user)
        {
            userRepo.save(user);
        }
    }
