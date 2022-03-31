package com.Skydiving;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SkydivingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SkydivingApplication.class, args);
		Entry entry=context.getBean(Entry.class);
		System.out.println(entry.getSerialnumber());
		
	
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args->{
			String[] beanNames=context.getBeanDefinitionNames();
			System.out.println("leats see beans");
			for(String b:beanNames)
				System.out.println(b);
		};
	}


}
