package com.assassins.todoroto.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/")
public class FrancoGeroController {

    @GetMapping("/franco-gero")
    public ResponseEntity<?> francoGero() {
        Map<String, Object> response = new HashMap<>();

        response.put("mensaje", "que haces wex");

        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }

    @GetMapping("/franco-gero-merge")
    public ResponseEntity<?> francoGeroMerge() {
        Map<String, Object> response = new HashMap<>();

        response.put("mensaje", "alto merge mostro");

        return new ResponseEntity<Map>(response, HttpStatus.OK);
    }

}
