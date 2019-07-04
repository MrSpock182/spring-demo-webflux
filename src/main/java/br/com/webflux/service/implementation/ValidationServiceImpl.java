package br.com.webflux.service.implementation;

import br.com.webflux.exception.BadRequest;
import br.com.webflux.service.ValidationService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Override
    public Mono<String> getMessage(String token) {
        return Mono.just(message(token));
    }

    private String message(String token) {
        if("teste".equalsIgnoreCase(token)) {
            throw new BadRequest("Token invalido, por favor troque a palavra: " + token);
        }

        return token;
    }

}
