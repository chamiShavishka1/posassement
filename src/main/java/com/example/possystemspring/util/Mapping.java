package com.example.possystemspring.util;

import lombok.RequiredArgsConstructor;
import com.example.possystemspring.dto.CustomerDTO;
import com.example.possystemspring.dto.ItemDTO;
import com.example.possystemspring.dto.OrderDTO;
import com.example.possystemspring.entity.CustomerEntity;
import com.example.possystemspring.entity.ItemEntity;
import com.example.possystemspring.entity.OrderEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    public OrderDTO convertToOrderDTO(OrderEntity order) {
        return modelMapper.map(order, OrderDTO.class);
    }

    public OrderEntity convertToOrderEntity(OrderDTO dto) {
        return modelMapper.map(dto, OrderEntity.class);
    }

    public List<OrderDTO> convertToOrderListDTO(List<OrderEntity> orders) {
        return modelMapper.map(orders, new TypeToken<List<OrderDTO>>() {
        }.getType());
    }

    //Customer mapping
    public CustomerEntity convertToCustomerEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, CustomerEntity.class);
    }

    public CustomerDTO convertToCUstomerDTO(CustomerEntity customerEntity) {
        return modelMapper.map(customerEntity, CustomerDTO.class);
    }

    public List<CustomerDTO> convertCustomerListToDTO(List<CustomerEntity> customerEntities) {
        return modelMapper.map(customerEntities, new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }

    //Item mapping
    public ItemEntity convertToItemEntity(ItemDTO itemDTO) {
        return modelMapper.map(itemDTO, ItemEntity.class);
    }

    public ItemDTO convertToItemDTO(ItemEntity itemEntity) {
        return modelMapper.map(itemEntity, ItemDTO.class);
    }

    public List<ItemDTO> convertItemListToDTO(List<ItemEntity> itemEntities) {
        return modelMapper.map(itemEntities, new TypeToken<List<ItemDTO>>() {
        }.getType());
    }
}
