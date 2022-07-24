package com.example.basket.Service;

import com.example.basket.Repository.BasketRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BasketService {

    public final BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

//    @PostConstruct
//    public void setup () {
//        System.out.println("service is created");
//    }
    public void add(Integer id) {
        basketRepository.addProductToBasket(id);
        System.out.println("добавили продукт: " + id);

    }
    public List<Integer> get() {
        return basketRepository.getBasket();
    }
}
