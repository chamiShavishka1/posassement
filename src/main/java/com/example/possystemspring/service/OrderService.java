package com.example.possystemspring.service;

import com.example.possystemspring.dto.OrderDTO;

public interface OrderService {
    OrderDTO saveOrder(OrderDTO orderDTO);
}
