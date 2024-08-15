package com.jc.curso.springboot.calendar.interceptor.springboothorario.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/foo")
    public ResponseEntity<?> foo(){
        Map<String, Object> data =  new HashMap<>();
        data.put("title", "Bienvenidos al sistema de atención!");
        data.put("time", new Date());
        return ResponseEntity.ok(data);
    }
}
