package com.example.demo18.Controller;


import com.example.demo18.Model.User;
import com.example.demo18.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @Value(value = "${welcome.message}")  //states the default value for the variable
    private String message;
//    @Value(value = "${car.brand")
//    private String brand;
//
//    @Value(value = "${car.color}")
//    private String color;
//
//    @Value(value = "${car.power}")
//    private int power;

    @GetMapping("/get")
    public String hello()
    {
        return message;
    }

        @GetMapping("/get2")
        public List<User> findAllUser() {
            return userService.getUser();
        }

        @PostMapping("/post")
        public long postUser(@RequestBody User user) {
            System.out.println("userName"+ user.getName());
            userService.saveUser(user);
            return user.getId();
        }
    }

