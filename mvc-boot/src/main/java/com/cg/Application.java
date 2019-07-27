package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	/**
	 * This Single line does following 
	 * 1.Create AnnotationConfigApplicationContext
	 * 2.It uses @ComponentScan for all child packages 
	 *   2.1 It picks up HelloController class 
	 *   2.2 Does Request mapping to '/' 
	 * 3. Reads application.properties 
	 *   3.1 Found one property 'server.port = 3000' 
	 * 4.Launches Embedded Tomcat server and deploy HelloController 
	 * 5. Wait form you to terminate the process
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
