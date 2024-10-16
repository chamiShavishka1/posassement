package com.example.possystemspring.dao;

import com.example.possystemspring.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO extends JpaRepository<OrderEntity, String> {
}
