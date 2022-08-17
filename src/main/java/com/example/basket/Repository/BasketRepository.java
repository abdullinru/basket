package com.example.basket.Repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class BasketRepository {
        public final List<Integer> basket = new ArrayList<>();

        @PostConstruct
        public void setup () {
            System.out.println("basket is created");
        }
        @PreDestroy
        public void destroy () {
        System.out.println("basket is removed");
    }
    public List<Integer> getBasket() {
        return basket;
    }
    public void addProductToBasket(Integer id) {
        basket.add(id);
    }
}
