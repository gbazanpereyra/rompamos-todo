package com.assassins.todoroto.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    
    @GetMapping("/hola-mundo")
    public ResponseEntity<?> holaMundo() {
        Map <String, Object> response = new HashMap<>();

        response.put("mensaje", "Hola mundo");

        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }

}
