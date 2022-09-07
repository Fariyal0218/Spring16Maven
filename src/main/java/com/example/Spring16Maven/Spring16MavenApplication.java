package com.example.Spring16Maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Spring16MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring16MavenApplication.class, args);
	}
	@GetMapping("hiiMaven")
	public String getMsg(){
		return "Hii Maven";
	}

}
//table - collection
//record/row - document
//json like structure