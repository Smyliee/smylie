package com.brickred.Inventory.Management.System.Dto;

import com.brickred.Inventory.Management.System.Entity.Inventory;
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
public class VendorDto {

    private  Integer vendorId;

    @NotNull
    private String vendorName;

    @NotNull
    private Long vendorMobileNo;
    @NotNull
    private String vendorCity;
    @NotNull
    private String vendorEmail;


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "vendorId")
//    private List<Inventory> inventoryList;

}
