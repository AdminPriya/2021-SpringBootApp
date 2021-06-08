package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext run	=SpringApplication.run(Application.class, args);
            int a=20;
	run.close();
	} 
    
     // HIS-12 RELATED CHANGES
     public void doProcess(){
        //logic
}   
}
