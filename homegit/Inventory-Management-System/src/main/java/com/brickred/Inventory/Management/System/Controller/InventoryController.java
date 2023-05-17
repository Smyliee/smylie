package com.brickred.Inventory.Management.System.Controller;

import com.brickred.Inventory.Management.System.Dto.InventoryDto;
import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Service.InventoryServiceImpl;
import com.brickred.Inventory.Management.System.Service.InventoryServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/inc")
public class InventoryController {
    @Autowired
    private InventoryServiceInterface inventoryServiceInterface;

    @Autowired
    private InventoryServiceImpl inventoryService;

    @PostMapping("/addInventory")
    public ResponseEntity<InventoryDto> createInventory(@Valid @RequestBody InventoryDto inventoryDto) {
        InventoryDto createinventoryDto = this.inventoryServiceInterface.createinventory(inventoryDto);
        return new ResponseEntity<InventoryDto>(createinventoryDto, HttpStatus.CREATED.OK);
    }
    @GetMapping("/getAllInventory")
    public List<InventoryDto> getAllInventory() {
        return inventoryServiceInterface.getAllInventory();
    }

    @PutMapping("/updateInventoryById/{id}")
    public ResponseEntity<InventoryDto> updateInventory(@Valid @RequestBody InventoryDto inventoryDto, @PathVariable Integer id) throws Throwable {
        InventoryDto InventoryDto1 = inventoryServiceInterface.updateinventory(inventoryDto, id);
        return new ResponseEntity<InventoryDto>(InventoryDto1, HttpStatus.CREATED.OK);
    }

    @DeleteMapping("/deleteInventoryById/{id}")
    public String deleteinventory(@PathVariable Integer id) {
        inventoryServiceInterface.deleteinventory(id);
        return "Sucessfully Deleted";
    }
    @GetMapping("/getInventoryDetailByCity/{inventoryCity}")
    public ResponseEntity <List<InventoryDto>>getAllInventoryDetailByCity(@Valid @RequestBody InventoryDto inventoryDto, @PathVariable String inventoryCity) {
    List<InventoryDto> inventoryDtoList = inventoryServiceInterface.findInventoryDetailByCityName(inventoryCity);
    return new ResponseEntity<List<InventoryDto>>(inventoryDtoList, HttpStatus.CREATED.OK);
}
@GetMapping("/getTotalCapacity/{inventoryCity}")
public ResponseEntity <Integer>getTotalCapacity(@Valid @RequestBody InventoryDto inventoryDto, @PathVariable String inventoryCity) {
    return new ResponseEntity<Integer>(inventoryServiceInterface.getTotalInventoryCapacityofCity(inventoryCity), HttpStatus.CREATED.OK);
}
//    @GetMapping("/getInventoryNameSortByCapacity")
//    public List<InventoryDto> getInventoryNameSortByCapacity() {
//        return inventoryServiceInterface.getInventoryListByInventoryCapacity();
//    }
    @GetMapping("/getInventoryNameSortByCapacity")
    public ResponseEntity<List<String>> getInventoryNameSortByCapacity() {
        return new ResponseEntity<>(inventoryService.sortListByCapacity(),HttpStatus.CREATED.OK);
    }
}
