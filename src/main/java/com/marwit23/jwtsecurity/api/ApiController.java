package com.marwit23.jwtsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {

    // * Available to all users
    @GetMapping("/user")
    public String userApi(){
        return "Welcome to user API";
    }

    // * Available to managers
    @GetMapping("/manager")
    public String managerApi(){
        return "Welcome to manager API";
    }

    // * Available to admin
    @GetMapping("/admin")
    public String adminApi(){
        return "Welcome to admin API";
    }
}
