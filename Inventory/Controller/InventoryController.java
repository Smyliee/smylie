package com.Brickred.Inventory.Controller;

import com.Brickred.Inventory.DTO.InventoryDto;
import com.Brickred.Inventory.DTO.ItemDto;
import com.Brickred.Inventory.Service.ServiceInventory;
import com.Brickred.Inventory.Service.ServiceItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RequestMapping("/iV")
@RestController
public class InventoryController {
    @Autowired
    private ServiceInventory serviceInventory;
    @PostMapping("/addInventory")
    public ResponseEntity<InventoryDto> createInventory(@Valid @RequestBody InventoryDto inventoryDto){
        InventoryDto createinventoryDto =this.serviceInventory.createinventory(inventoryDto);
        return new ResponseEntity<InventoryDto>(createinventoryDto,HttpStatus.CREATED.OK);
    }

    @GetMapping("/getAllInventories")
    public List<InventoryDto> getAllInventories(){
        return serviceInventory.getAllInventories();
    }
    @PutMapping("/updateInventoryById/{id}")
    public  ResponseEntity<InventoryDto>updateInventory(@Valid @RequestBody InventoryDto inventoryDto, @PathVariable Integer id){
        InventoryDto InventoryDto1 = serviceInventory.updateinventory(inventoryDto,id);
        return  new ResponseEntity<InventoryDto>(InventoryDto1,HttpStatus.CREATED.OK);
    }
    @DeleteMapping("/deleteInventoryById/{id}")
    public  String deleteInventory(@PathVariable Integer id){
        serviceInventory.deleteinventory(id);
        return "Sucessfully Deleted";
    }
}
