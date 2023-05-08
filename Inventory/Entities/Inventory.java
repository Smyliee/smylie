package com.Brickred.Inventory.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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


}