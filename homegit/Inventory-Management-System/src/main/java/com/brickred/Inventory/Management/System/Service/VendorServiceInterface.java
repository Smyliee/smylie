package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.InventoryDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;

import java.util.List;

public interface VendorServiceInterface {
    public List<VendorDto> getAllVendor();
    public VendorDto createvendor(VendorDto vendorDto);
    public VendorDto updatevendor(VendorDto vendorDto,Integer  id) throws Throwable;

    public void  deletevendor( Integer id);
}
