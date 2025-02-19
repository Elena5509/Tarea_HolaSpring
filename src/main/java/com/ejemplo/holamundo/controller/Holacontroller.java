package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Holacontroller {

    @GetMapping("/hola")
    public String decirHola() {
        return "¡Hola Spring!";
    }
}
