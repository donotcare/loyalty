package loyalty.controller;

import loyalty.model.Product;
import loyalty.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.ParallelFlux;
import reactor.core.scheduler.Schedulers;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class LoyaltyController {
    @Autowired
    private ProductService productService;


    @GetMapping(value = "/test")
    public ParallelFlux<Product> test() {
        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        return Flux.range(1, 10000).flatMap(productService::getProduct).parallel().runOn(Schedulers.parallel());
    }

}
