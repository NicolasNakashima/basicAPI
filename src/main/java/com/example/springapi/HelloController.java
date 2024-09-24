package com.example.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Pessoa pessoa1 = new Pessoa("Joe Doe",59);
    @GetMapping("/hello")
    public Pessoa hello(){
        return pessoa1;
    }
}
