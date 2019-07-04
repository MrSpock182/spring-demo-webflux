package br.com.webflux.controller;

import br.com.webflux.entity.MyObject;
import br.com.webflux.service.ConvertService;
import br.com.webflux.service.ValidationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/web-flux")
public class MyController {

    private final ValidationService validation;
    private final ConvertService convert;

    @GetMapping("/message/{token}")
    public Mono<MyObject> getMessage(@PathVariable final String token) {
        return validation.getMessage(token)
                .flatMap(convert::convert);
    }

}
