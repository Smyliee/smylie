package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.InventoryDto;
import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Entity.Inventory;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InventoryServiceInterface {
    public List<InventoryDto> getAllInventory();

    public InventoryDto createinventory(InventoryDto inventoryDto);

    public InventoryDto updateinventory(InventoryDto inventoryDto, Integer id) throws Throwable;

    public void deleteinventory(Integer id);

    public List<InventoryDto> findInventoryDetailByCityName(String inventorCity);


    public Integer getTotalInventoryCapacityofCity(String inventoryCity);

   public List<String> sortListByCapacity();
}
