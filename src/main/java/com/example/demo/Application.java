package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
        private Map<String,Object> cache= new HashMap<String, Object>();
        private static final String REST_URL="https://www.equifax.com/getscore";
  
	public static void main(String[] args) {
	  ConfigurableApplicationContext run=SpringApplication.run(Application.class, args);
            int a=20;
	run.close();
	}
  //HIS-301 changes
   public void loadDataToCache(){
    //logic
   }
}
