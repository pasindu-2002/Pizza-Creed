package com.pasindu.pizza_creed.controller;

import com.pasindu.pizza_creed.model.BasketItem;
import com.pasindu.pizza_creed.model.Order;
import com.pasindu.pizza_creed.model.ShoppingBasket;
import com.pasindu.pizza_creed.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/baskets")
public class ShoppingBasketRestController {
    @Autowired
    private ShoppingBasketService service;

    @PostMapping
    public ShoppingBasket createBasket() {
        return service.createBasket();
    }

    @PostMapping("/{basketId}/items")
    public ShoppingBasket addProduct(@PathVariable Long basketId, @RequestBody BasketItem item) {
        return service.addProduct(basketId, item.getPizza(), item.getQuantity());
    }

    @DeleteMapping("/{basketId}/items/{itemId}")
    public ShoppingBasket removeProduct(@PathVariable Long basketId, @PathVariable Long itemId) {
        return service.removeProduct(basketId, itemId);
    }

    @GetMapping("/{basketId}")
    public ShoppingBasket viewBasket(@PathVariable Long basketId) {
        return service.viewBasket(basketId);
    }

    @PostMapping("/{basketId}/checkout")
    public Order checkout(@PathVariable Long basketId) {
        return service.checkout(basketId);
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/orders/{OrderID}")
    public Optional<Order> getOrderById(@PathVariable Long OrderID) {
        return service.getOrderById(OrderID);
    }

    @DeleteMapping("/{basketId}/clear")
    public ShoppingBasket clearBasket(@PathVariable Long basketId) {
        return service.clearBasket(basketId);
    }

}