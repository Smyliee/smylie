package com.brickred.Inventory.Management.System.Controller;

import com.brickred.Inventory.Management.System.Dto.InventoryDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;
import com.brickred.Inventory.Management.System.Service.InventoryServiceInterface;
import com.brickred.Inventory.Management.System.Service.VendorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RequestMapping("/vm")
@RestController
public class VendorController {

    @Autowired
    private VendorServiceInterface serviceVendor;
    @PostMapping("/addVendor")
    public ResponseEntity<VendorDto> createVendor(@Valid @RequestBody VendorDto vendorDto) {
        VendorDto createvendorDto = this.serviceVendor.createvendor(vendorDto);
        return new ResponseEntity<VendorDto>(createvendorDto, HttpStatus.CREATED.OK);
    }
    @GetMapping("/getAllVendor")
    public List<VendorDto> getAllVendor() {
        return serviceVendor.getAllVendor();
    }

    @PutMapping("/updateVendorById/{id}")
    public ResponseEntity<VendorDto> updateVendor(@Valid @RequestBody VendorDto vendorDto, @PathVariable Integer id) throws Throwable {
        VendorDto VendorDto1 = serviceVendor.updatevendor(vendorDto, id);
        return new ResponseEntity<VendorDto>(VendorDto1, HttpStatus.CREATED.OK);
    }

    @DeleteMapping("/deleteVendorById/{id}")
    public String deletevendor(@PathVariable Integer id) {
        serviceVendor.deletevendor(id);
        return "Sucessfully Deleted";
    }
}
