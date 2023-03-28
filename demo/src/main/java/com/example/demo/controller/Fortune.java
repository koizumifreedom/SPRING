package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {

  @RequestMapping("/fortune")
  public String start() {
    double fn = Math.random();
    if (fn >= 0.7) {
      return "greatFortune.html";
    } else if (fn >= 0.4) {
      return "middleFortune.html";
    } else if (fn >= 0.1) {
      return "samallFortune.html";
    } else {
      return "miosFortune.html";
    }
  }
  
}
