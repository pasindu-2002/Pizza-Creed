package com.pasindu.pizza_creed.repository;

import com.pasindu.pizza_creed.model.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketItemRepository extends JpaRepository<BasketItem, Long> {
}
