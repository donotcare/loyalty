package loyalty.service;

import loyalty.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@Service
public class ProductService {
    @Autowired
    private BonusService bonusService;

    @Autowired
    private PriceService priceService;

    public Mono<Product> getProduct(int productId) {
        Mono<Tuple2<Integer, Integer>> res = Mono.zip(bonusService.getBonus(productId), priceService.getPrice(productId));
        return Mono.just(new Product(productId)).zipWith(res, (product, tuple) -> product.setBonus(tuple.getT1()).setPrice(tuple.getT2()));
    }
}
