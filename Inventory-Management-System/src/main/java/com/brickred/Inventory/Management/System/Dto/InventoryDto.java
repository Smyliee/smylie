package com.brickred.Inventory.Management.System.Dto;

import com.brickred.Inventory.Management.System.Entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InventoryDto {


    private Integer inventoryId;


    private String inventoryName;


    private Integer inventoryCity;

    private String inventoryCapacity;


    @Column(name = "vendorId" )
    private Integer vendorId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventoryId")
    private List<Item> itemList;
}

