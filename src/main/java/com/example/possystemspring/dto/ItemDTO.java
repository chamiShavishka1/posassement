package com.example.possystemspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.possystemspring.customObj.ItemResponse;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO implements SuperDTO, ItemResponse {
    private String code;
    private String description;
    private double price;
    private int qty;
}
