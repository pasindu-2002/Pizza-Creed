package com.pasindu.pizza_creed.service.impl;

import com.pasindu.pizza_creed.model.Pizza;
import com.pasindu.pizza_creed.repository.PizzaRepository;
import com.pasindu.pizza_creed.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;
    @Override
    public List<Pizza> listAll() {
        return pizzaRepository.findAll();
    }

    @Override
    public void addPizza(@RequestBody Pizza pizza) {
        pizzaRepository.save(pizza);
    }

    @Override
    public Pizza getPizza(Long id) {
        Pizza pizza = pizzaRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_EXTENDED,"Id Not Found"));
        return pizza;
    }

    @Override
    public void deletePizza(Long id) {
        pizzaRepository.deleteById(id);
    }

    public Pizza get(Long id) {
        return pizzaRepository.findById(id).get();
    }

    @Override
    public Object getAllPizzas() {
        return pizzaRepository.findAll();
    }

}
