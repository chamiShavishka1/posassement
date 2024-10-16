package com.example.possystemspring.dao;

import com.example.possystemspring.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerEntity, String> {
}
