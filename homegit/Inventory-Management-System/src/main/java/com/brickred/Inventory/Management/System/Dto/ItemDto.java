package com.brickred.Inventory.Management.System.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDto {

    private  Integer itemId;

    @NotNull
    private String itemName;

    @NotNull
    private Integer itemCapacity;
    @NotNull
    private String itemRating;

    @NotNull
    private String itemArticleId;
//    @Column(name="inventoryId",nullable = false)
//    private Integer inventoryId;
}
