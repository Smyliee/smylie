package com.Brickred.Inventory.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "items")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer itemid;

    @Column(name = "itemname" )
    private String itemName;

    @Column(name = "quantity" )
    private Integer quantity;
    @Column(name="quantityperpiece",nullable = false)
    private Integer quantityperpiece;

    @Column(name="totalprice",nullable = false)
    private Integer totalprice;

}
