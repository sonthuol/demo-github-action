package com.github.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello demo github action";
	}

}
