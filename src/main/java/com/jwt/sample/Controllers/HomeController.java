package com.jwt.sample.Controllers;

import com.jwt.sample.Services.UserService;
import com.jwt.sample.models.User;
import com.sun.source.tree.ReturnTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;

    // http://localhost:8081/home/user

    @GetMapping("/user")
    public List<User> getUser() {

        System.out.println("getting user");
        return userService.getUsers();

    }
}
