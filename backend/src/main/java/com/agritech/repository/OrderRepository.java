package com.agritech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByBuyerId(Long buyerId);
    List<Order> findByTransporterId(Long transporterId);
    List<Order> findByStatus(String status);
}