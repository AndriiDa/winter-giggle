package com.dan.winter.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PersonController {

  @RequestMapping("/profile")
  public String getPersonProfile(){
    return "persons-profile test";
  }
}
