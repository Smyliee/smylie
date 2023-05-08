package com.brickred.Inventory.Management.System.Controller;

import com.brickred.Inventory.Management.System.Dto.VendorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/ims")
public class VendorController {
    @PostMapping("/addVendor")
    public ResponseEntity<VendorDto> createItem( @RequestBody VendorDto vendorDto){

    }
}
