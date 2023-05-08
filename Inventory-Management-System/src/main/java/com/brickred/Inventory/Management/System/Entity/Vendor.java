package com.brickred.Inventory.Management.System.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "vendor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer vendorId;

    @Column(name = "vendorName" )
    private String vendorName;

    @Column(name = "vendorMobileNo" )
    private Long vendorMobileNo;
    @Column(name="vendorCity",nullable = false)
    private String vendorCity;
    @Column(name="vendorEmail",nullable = false)
    private String vendorEmail;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendorId")
    private List<Inventory> inventoryList;

}
