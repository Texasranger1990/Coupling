package com.mwalker.coupling.order.repository;

import com.mwalker.coupling.order.repository.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
}
