package com.brickred.Inventory.Management.System.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer itemId;

    @Column(name = "itemName" )
    private String itemName;

    @Column(name = "itemCapacity" )
    private Integer itemCapacity;
    @Column(name="itemRating",nullable = false)
    private String itemRating;

    @Column(name="itemArticleId",nullable = false)
    private String itemArticleId;

//    @Column(name="inventoryId",nullable = false)
//    private Integer inventoryId;
}
