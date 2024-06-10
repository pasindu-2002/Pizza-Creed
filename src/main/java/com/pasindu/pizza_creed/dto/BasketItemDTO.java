package com.pasindu.pizza_creed.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasketItemDTO {
    private Long id;
    private Long quantity;
    private Long pizzaId;
    private String pizzaName;
    private String pizzaSize;
    private Double pizzaPrice;
    private double total;
}
