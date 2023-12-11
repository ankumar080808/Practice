package com.example.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Compo;

import jakarta.annotation.PostConstruct;

/*import com.example.test.MyScheduler;*/

@SpringBootApplication
/* @EnableScheduling */

 @ComponentScan(basePackages= {"com.example.test"}) 
@RestController
@RequestMapping("/message")
public class PracticeApplication {

	
	/* @Autowired private Compo compo; */
	 
	
		/*
		 * @PostConstruct public void Compos() {
		 * System.out.println("Inside compos method"); compo.compoo(); }
		 */
	@GetMapping
	public String getMessage()
	{
		return "Docker using maven";
	}
	 
	 public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	
	}
	
	
	/*
	 * @Bean public MyScheduler myScheduler() { return new MyScheduler(); }
	 */
	
	
	/*
	 * @Bean public Compo getCompo() {
	 * 
	 * Compo com= new Compo(); compo.compoo(); return com;
	 * 
	 * }
	 */
	 
	 
	 
}
