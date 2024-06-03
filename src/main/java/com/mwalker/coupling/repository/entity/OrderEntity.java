package com.mwalker.coupling.repository.entity;

import com.mwalker.coupling.model.Order;
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

    public Order toOrder() {
        Order result = new Order();
        result.setOrderId(this.orderId);
        result.setOrderState(this.orderState);

        return result;
    }

    public static OrderEntity fromOrder(Order order) {
        OrderEntity result = new OrderEntity();
        result.setOrderState(order.getOrderState());
        result.setOrderId(order.getOrderId());

        return result;
    }
}
