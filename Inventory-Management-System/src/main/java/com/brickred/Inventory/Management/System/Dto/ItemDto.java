package com.brickred.Inventory.Management.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDto {

    private  Integer itemId;


    private String itemName;


    private Integer itemCapacity;

    private String itemRating;


    private String itemArticleId;
    @Column(name="inventoryId",nullable = false)
    private Integer inventoryId;
}
