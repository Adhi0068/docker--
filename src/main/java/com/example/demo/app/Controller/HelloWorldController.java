package com.example.demo.app.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/message")
    public int getMessage(){
        int a = 10 + 39;
        return a ;
    }
    
}
