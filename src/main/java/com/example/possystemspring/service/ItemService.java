package com.example.possystemspring.service;

import com.example.possystemspring.customObj.ItemResponse;
import com.example.possystemspring.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);

    void updateItem(String code, ItemDTO itemDTO);

    void deleteItem(String code);

    ItemResponse getSelectedItem(String code);

    List<ItemDTO> getAllItems();
}
