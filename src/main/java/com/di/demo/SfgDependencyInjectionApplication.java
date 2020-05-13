package com.di.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.di.demo.controllers.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.di.demo.services","com.di.demo.controllers"})
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDependencyInjectionApplication.class, args);
//		SpringApplication.run(SfgDependencyInjectionApplication.class, args);
		
//		I18NController i18nController =(I18NController) ctx.getBean("i18NController");
//		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("------Primary Service Injected");
		System.out.println(myController.sayHello());

//		System.out.println("------Property Injected");
//		PropertyInjectedController propertyController = (PropertyInjectedController) ctx
//				.getBean("propertyInjectedController");
//		System.out.println(propertyController.getGreeting());
//
//		System.out.println("------Setter Injected");
//		SetterInjectedController setterController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//		System.out.println(setterController.getGreeting());
//
//		System.out.println("------Constructor Injected");
//		ConstructorInjectedController constructorController = (ConstructorInjectedController) ctx
//				.getBean("constructorInjectedController");
//		System.out.println(constructorController.getGreeting());

	}

}
