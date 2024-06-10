package com.pasindu.pizza_creed.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShoppingBasketDTO {
    private Long id;
    private String status;
    private double totalAmount;
    private List<BasketItemDTO> item;
}
