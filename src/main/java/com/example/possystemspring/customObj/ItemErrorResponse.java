package com.example.possystemspring.customObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemErrorResponse implements ItemResponse {
    private String status;
    private String message;
}
