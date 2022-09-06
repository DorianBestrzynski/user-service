package com.zpi.userservice.user;

import lombok.RequiredArgsConstructor;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;


    @GetMapping("/test")
    public String helloWorld(){
        return "Hello Boba";
    }



}
