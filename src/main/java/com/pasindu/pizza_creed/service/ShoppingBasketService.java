package com.pasindu.pizza_creed.service;

import com.pasindu.pizza_creed.model.Order;
import com.pasindu.pizza_creed.model.Pizza;
import com.pasindu.pizza_creed.model.ShoppingBasket;

import java.util.List;
import java.util.Optional;

public interface ShoppingBasketService {
    ShoppingBasket getBasketById(Long basketId);

    ShoppingBasket createBasket();

    ShoppingBasket viewBasket(Long basketId);

    Order checkout(Long basketId);

    ShoppingBasket removeProduct(Long basketId, Long itemId);

    ShoppingBasket addProduct(Long basketId, Pizza pizza, int quantity);

    Order getOrder();

    List<Order> getAllOrders();

    Optional<Order> getOrderById(Long orderID);

    ShoppingBasket clearBasket(Long basketId);
}
