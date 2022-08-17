package com.example.basket.Controller;

import com.example.basket.Service.BasketService;
import com.example.basket.Service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BusketController {

    public final BasketService basketService;

    public BusketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("id") List<Integer> ids) {
        ids.forEach(basketService::add);
    }

    @GetMapping("/get")
    public List<Integer> getProduct() {
        return basketService.get();
    }
}
