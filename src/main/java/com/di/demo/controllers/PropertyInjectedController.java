package com.di.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.di.demo.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class PropertyInjectedController {

//	@Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
