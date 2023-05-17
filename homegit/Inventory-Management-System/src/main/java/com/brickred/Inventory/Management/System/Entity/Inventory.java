package com.brickred.Inventory.Management.System.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "inventory")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer inventoryId;

    @Column(name = "inventoryName" )
    private String inventoryName;

    @Column(name = "inventoryCity" )
    private String inventoryCity;
    @Column(name="inventoryCapacity",nullable = false)
    private Integer inventoryCapacity;
//    @Column(name = "vendorId" )
//    private Integer vendorId;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "inventoryId")
//    private List<Item> itemList;

}

