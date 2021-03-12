package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

 @Autowired
 private Environment env;

 @RequestMapping(method = RequestMethod.GET, value = "${db.user}")
 public String testing1() {
 System.out.println("db.user is "+env.getProperty("db.user"));
 return "hostName";
 
 }
 @RequestMapping(method = RequestMethod.GET, value = "/hello")
 public String testing() {
 System.out.println("db.user is "+env.getProperty("db.user"));
 return "hostName";
 
 }
}