package com.di.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.di.demo.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class MyController {
	
	@Autowired
	private GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
