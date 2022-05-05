package com.hashedin.hu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
//@ComponentScan(basePackages = "com.hashedin.hu.schedular")
public class MiniAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniAssignmentApplication.class, args);
	}

}
