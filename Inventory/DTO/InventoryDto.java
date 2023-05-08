package com.Brickred.Inventory.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InventoryDto {
    private Integer inventoryId;


    private String inventoryName;


    private  String inventoryCity;

    private Integer inventoryCapacity;
}
