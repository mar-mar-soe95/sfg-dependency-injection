package com.di.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18NService")
public class i18NSpanishService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hola- ES";
	}

}
