package com.example.basket.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketService {

    public final List<Integer> basket = new ArrayList<>();
    public void add(Integer id, Integer ... idProduct) {
        basket.add(id);
        System.out.println("добавили продукт: " + id);
        for (Integer integer : idProduct) {
            basket.add(idProduct[id]);
            System.out.println("добавили продукт: " + integer);
        }

    }
    public List<Integer> get() {
        return basket;

    }
}
