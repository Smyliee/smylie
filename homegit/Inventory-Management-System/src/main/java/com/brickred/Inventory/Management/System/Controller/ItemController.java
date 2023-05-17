package com.brickred.Inventory.Management.System.Controller;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Service.ItemServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/iv")
public class ItemController {
    @Autowired
    private ItemServiceInterface serviceItems;

    @PostMapping("/add")
    public ResponseEntity<ItemDto> createItem(@Valid @RequestBody ItemDto itemDto) {
        ItemDto createitemDto = this.serviceItems.createitem(itemDto);
        return new ResponseEntity<ItemDto>(createitemDto, HttpStatus.CREATED.OK);
    }

    @GetMapping("/getAllItems")
    public List<ItemDto> getAllItems() {
        return serviceItems.getAllItems();
    }

    @PutMapping("/updateItemById/{id}")
    public ResponseEntity<ItemDto> updateItem(@Valid @RequestBody ItemDto itemDto, @PathVariable Integer id) throws Throwable {
        ItemDto itemDto1 = serviceItems.updateitem(itemDto, id);
        return new ResponseEntity<ItemDto>(itemDto1, HttpStatus.CREATED.OK);
    }

    @DeleteMapping("/deleteItemById/{id}")
    public String deleteItem(@PathVariable Integer id) {
        serviceItems.deleteitem(id);
        return "Sucessfully Deleted";
    }
    @GetMapping("/getDetailsByName/{itemName}")
    public ResponseEntity<ItemDto>getDetailByName(@Valid @RequestBody ItemDto itemDto,@PathVariable String itemName){
        ItemDto itemDto1 = serviceItems.findItemDetailsByName(itemName);
        return new ResponseEntity<ItemDto>(itemDto1,HttpStatus.CREATED.OK);
    }
    @GetMapping("/getSortItemsByRating")
    public List<ItemDto> getSortItemsByRating() {
        return serviceItems.getItemBySortByRating();
    }


}