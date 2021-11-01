package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MyServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/JavaJam")
public class JavaJamController {
	
	@Autowired
	MyServiceImpl MyServ;
	
	@PostMapping
	public String saveApplication(@RequestParam("myName") String name, @RequestParam("myEmail") String email, @RequestParam("myExperience") String exp)
	{
		MyServ.saveApplication(name, email, exp);
		return "Application saved successfully";
	}

}
