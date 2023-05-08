package com.brickred.Inventory.Management.System.Dto;

import com.brickred.Inventory.Management.System.Entity.Inventory;
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
public class VendorDto {

    private  Integer vendorId;


    private String vendorName;


    private Long vendorMobileNo;

    private String vendorCity;

    private String vendorEmail;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendorId")
    private List<Inventory> inventoryList;

}
