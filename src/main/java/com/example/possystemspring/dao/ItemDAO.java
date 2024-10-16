package com.example.possystemspring.dao;

import com.example.possystemspring.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO extends JpaRepository<ItemEntity, String> {
}
