package br.com.webflux.service;

import br.com.webflux.entity.MyObject;
import reactor.core.publisher.Mono;

public interface ConvertService {
    Mono<MyObject> convert(String mensage);
}
