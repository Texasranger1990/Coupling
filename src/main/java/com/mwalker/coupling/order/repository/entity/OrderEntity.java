package com.mwalker.coupling.order.repository.entity;

import com.mwalker.coupling.order.model.Order;
import com.mwalker.coupling.order.model.OrderState;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table()
public class OrderEntity {
    @Id
    private long orderId;
    private OrderState orderState;
    private long userId;

    public Order toOrder() {
        Order result = new Order();
        result.setOrderId(this.orderId);
        result.setOrderState(this.orderState);
        result.setUserId(this.userId);

        return result;
    }

    public static OrderEntity fromOrder(Order order) {
        OrderEntity result = new OrderEntity();
        result.setOrderState(order.getOrderState());
        result.setOrderId(order.getOrderId());
        result.setUserId(order.getUserId());

        return result;
    }
}
