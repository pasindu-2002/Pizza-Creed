package com.pasindu.pizza_creed.service.impl;

import com.pasindu.pizza_creed.model.BasketItem;
import com.pasindu.pizza_creed.model.Order;
import com.pasindu.pizza_creed.model.Pizza;
import com.pasindu.pizza_creed.model.ShoppingBasket;
import com.pasindu.pizza_creed.repository.OrderRepository;
import com.pasindu.pizza_creed.repository.ShoppingBasketRepository;
import com.pasindu.pizza_creed.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {
    @Autowired
    private ShoppingBasketRepository repository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public ShoppingBasket getBasketById(Long basketId) {
        return null;
    }

    @Override
    public ShoppingBasket createBasket() {
        return repository.save(new ShoppingBasket());
    }

    @Override
    public ShoppingBasket viewBasket(Long basketId) {
        return repository.findById(basketId).orElseThrow();
    }

    @Override
    public Order checkout(Long basketId) {

        ShoppingBasket basket = repository.findById(basketId).orElseThrow();

        // Calculate total amount
        double totalAmount = basket.getItems().stream()
                .mapToDouble(item -> item.getPizza().getPrice() * item.getQuantity())
                .sum();

        // Create an Order
        Order order = Order.builder()
                .shoppingBasket(basket)
                .totalAmount(totalAmount)
                .build();

        // Save the Order
        orderRepository.save(order);

        return order;
    }

    @Override
    public ShoppingBasket removeProduct(Long basketId, Long itemId) {
        ShoppingBasket basket = repository.findById(basketId).orElseThrow();
        basket.getItems().removeIf(item -> item.getId().equals(itemId));
        return repository.save(basket);
    }


    @Override
    public ShoppingBasket addProduct(Long basketId, Pizza pizza, int quantity) {
        ShoppingBasket basket = repository.findById(basketId).orElseThrow();
        basket.getItems().add(new BasketItem(basketId,pizza,quantity));
        return repository.save(basket);
    }

    @Override
    public Order getOrder() {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long orderID) {
        return orderRepository.findById(orderID);
    }

    @Override
    public ShoppingBasket clearBasket(Long basketId) {
        ShoppingBasket basket = repository.findById(basketId)
                .orElseThrow(() -> new IllegalStateException("Basket not found"));

//        if (basket.isCheckedOut()) {
//            throw new IllegalStateException("Cannot clear a checked-out basket.");
//        }

        basket.getItems().clear();
        return repository.save(basket);
    }


}
