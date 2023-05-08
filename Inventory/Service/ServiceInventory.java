package com.Brickred.Inventory.Service;

import com.Brickred.Inventory.DTO.InventoryDto;
import com.Brickred.Inventory.DTO.ItemDto;

import java.util.List;

public interface ServiceInventory {
    public List<InventoryDto> getAllInventories();
    public InventoryDto createinventory(InventoryDto inventoryDto);
    public InventoryDto updateinventory(InventoryDto inventoryDto, Integer invtid);




    public void  deleteinventory(Integer invtid);
}
