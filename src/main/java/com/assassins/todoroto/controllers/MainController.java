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

    @GetMapping("/franco")
    public ResponseEntity<?> probando() {
        Map <String, Object> response = new HashMap<>();

        response.put("mensaje", "Rompiendo todo 3.0 remix");

        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }

    @GetMapping("/lucho")
    public ResponseEntity<?> testeando() {
        Map <String, Object> response = new HashMap<>();

        response.put("mensaje", "Mi nombre es Cosme Fulanito.");

        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }

    @GetMapping("/martina")
    public ResponseEntity<?> rompiendo() {
        Map <String, Object> response = new HashMap<>();

        response.put("mensaje", "Hola muchachada.");

        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }

}
