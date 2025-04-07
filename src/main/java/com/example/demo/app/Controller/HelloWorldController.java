package com.example.demo.app.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/message")
    public int getMessage(){
        for (int i = 0 ; i < 67 ; i++){
            i = i + 10;
        }
        return i ;
    }
    
}
