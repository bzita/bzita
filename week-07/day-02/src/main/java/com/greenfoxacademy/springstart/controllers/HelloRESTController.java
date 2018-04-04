package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")
  public Greeting greetingMethod() {
    return new Greeting(1, "Hello World!");
  }
}

//http://localhost:8080/greeting
