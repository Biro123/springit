package com.robson.springit;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
		System.out.println("Welcome to Springit");
	}

//	@Bean
//	CommandLineRunner runner (LinkRepository linkRepository, CommentRepository commentRepository) {
//		// Sets up some starting data. Runs when the application starts
//		return args -> {
//			Link link = new Link("Getting started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
//			linkRepository.save(link);
//
//			Comment comment = new Comment("This Spring Boot 2 link is awesome", link);
//			commentRepository.save(comment);    // adds the link to the comment to the database
//			link.addComment(comment);           // adds the link in the model
//
//		};
//	}

	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}

}
