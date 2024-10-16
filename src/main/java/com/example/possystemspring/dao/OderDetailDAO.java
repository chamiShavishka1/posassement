package com.example.possystemspring.dao;

import com.example.possystemspring.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderDetailDAO extends JpaRepository<OrderDetailEntity, Long> {
}
