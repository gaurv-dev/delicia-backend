package com.gaurav.delicia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DeliciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliciaApplication.class, args);
	}

}
		