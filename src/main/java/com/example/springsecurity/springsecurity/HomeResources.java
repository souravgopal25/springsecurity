package com.example.springsecurity.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome<h1>");
    }
}
