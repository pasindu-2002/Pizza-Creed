package com.pasindu.pizza_creed.service;

import com.pasindu.pizza_creed.model.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> listAll();

    void addPizza(Pizza pizza);

    Pizza getPizza(Long id);

    void deletePizza(Long id);

    Pizza get(Long id);

    Object getAllPizzas();
}
