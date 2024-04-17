package com.mwalker.coupling.rest.dto;

import lombok.Data;

@Data
public class ItemDto {
    private String name;
    private long amount;
    private double price;
}
