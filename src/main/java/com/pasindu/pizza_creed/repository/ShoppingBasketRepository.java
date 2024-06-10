package com.pasindu.pizza_creed.repository;

import com.pasindu.pizza_creed.model.ShoppingBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasket, Long> {
}
