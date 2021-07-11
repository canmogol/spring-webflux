package com.canmogol.webflux;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class GreetingWebClient {

    private WebClient client = WebClient.create("http://localhost:8080");

    private Mono<String> result = client.get()
            .uri("/hello")
            .accept(MediaType.TEXT_PLAIN)
            .retrieve()
            .bodyToMono(String.class)
            .map(s -> ">> result = " + s);

    public Mono<String> getResult() {
        return result;
    }
}