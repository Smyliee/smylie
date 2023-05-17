package com.brickred.Inventory.Management.System.Dto;

import com.brickred.Inventory.Management.System.Entity.Item;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InventoryDto {


    private Integer inventoryId;

    @NotNull
    private String inventoryName;

    @NotNull
    private String inventoryCity;
    @NotNull
    private Integer inventoryCapacity;


//    @Column(name = "vendorId" )
//    private Integer vendorId;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "inventoryId")
//    private List<Item> itemList;
}

