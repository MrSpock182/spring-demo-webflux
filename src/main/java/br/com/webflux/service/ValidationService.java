package br.com.webflux.service;

import reactor.core.publisher.Mono;

public interface ValidationService {
    Mono<String> getMessage(String token);
}
