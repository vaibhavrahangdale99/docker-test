package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PracticeController {
	
	 @GetMapping("/test")
	    public String getMessage(){
	        System.out.println("##########################");
	        return "Jai Shree Ram";
	    }

}
