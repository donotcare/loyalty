package loyalty.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PriceService {
    public Mono<Integer> getPrice(int productId){
        return Mono.just(10000).doOnNext(s -> System.out.println("Get price " + System.currentTimeMillis()));
    }
}
