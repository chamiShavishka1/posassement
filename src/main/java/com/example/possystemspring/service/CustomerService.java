package com.example.possystemspring.service;

import com.example.possystemspring.customObj.CustomerResponse;
import com.example.possystemspring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String customerId);

    CustomerResponse getSelectedCustomer(String customerId);

    List<CustomerDTO> getAllCustomers();
}
