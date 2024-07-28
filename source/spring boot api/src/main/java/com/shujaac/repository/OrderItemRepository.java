package com.shujaac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shujaac.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
