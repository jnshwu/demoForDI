package com.example.demo;

import com.example.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext cxt = SpringApplication.run(DemoApplication.class, args);
		MyController myController = (MyController) cxt.getBean("myController");

		myController.Hello();
	}
}
