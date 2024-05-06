package com.online.chat.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PostMapping("/api/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (username.equals("test") && password.equals("password")) {

        }
        return "";
    }


}
