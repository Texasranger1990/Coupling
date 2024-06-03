package com.mwalker.coupling.repository.entity;

import com.mwalker.coupling.model.OrderState;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table()
public class OrderEntity {
    @Id
    private long orderId;
    private OrderState orderState;
}
