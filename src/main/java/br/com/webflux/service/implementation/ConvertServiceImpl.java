package br.com.webflux.service.implementation;

import br.com.webflux.entity.MyObject;
import br.com.webflux.exception.NotFoundException;
import br.com.webflux.service.ConvertService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ConvertServiceImpl implements ConvertService {

    @Override
    public Mono<MyObject> convert(String mensage) {
        return Mono.just(convertion(mensage));
    }

    private MyObject convertion(String mensage) {
        if("kleber".equalsIgnoreCase(mensage)) {
            throw new NotFoundException("Usuario não encontrado:");
        }

        return MyObject.builder()
                .token(mensage)
                .build();
    }

}
