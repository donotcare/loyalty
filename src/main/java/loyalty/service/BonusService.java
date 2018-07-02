package loyalty.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BonusService {
    public Mono<Integer> getBonus(int productId){
        return Mono.just(100).doOnNext(s -> System.out.println("Get bonus " + System.currentTimeMillis()));
    }
}
