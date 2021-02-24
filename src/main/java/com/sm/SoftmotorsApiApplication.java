package com.sm;

//import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SoftmotorsApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SoftmotorsApiApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
		return builder.sources(SoftmotorsApiApplication.class);
	}
	
	@GetMapping(value="/hello")
    public String hello() {
          return "Hello, ";
    }

}
