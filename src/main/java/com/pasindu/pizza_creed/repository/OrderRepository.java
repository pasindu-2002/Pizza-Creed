package com.pasindu.pizza_creed.repository;

import com.pasindu.pizza_creed.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
