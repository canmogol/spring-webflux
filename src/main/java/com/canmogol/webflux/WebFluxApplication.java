package com.canmogol.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxApplication.class, args);
		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult().block());
	}

}
