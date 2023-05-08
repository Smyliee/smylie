package com.Brickred.Inventory.Controller;

import com.Brickred.Inventory.DTO.ItemDto;
import com.Brickred.Inventory.Entities.Items;
import com.Brickred.Inventory.Service.ServiceItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/iv")
public class Controller {
    @Autowired
    private ServiceItems serviceInventory;
    @PostMapping("/add")
    public ResponseEntity<ItemDto> createItem(@Valid @RequestBody ItemDto itemDto){
        ItemDto createitemDto =this.serviceInventory.createitem(itemDto);
        return new ResponseEntity<ItemDto>(createitemDto, HttpStatus.CREATED.OK);
    }

    @GetMapping("/getAllItems")
    public List<ItemDto> getAllItems(){
        return serviceInventory.getAllItems();
    }
    @PutMapping("/updateItemById/{id}")
    public  ResponseEntity<ItemDto>updateItem(@Valid @RequestBody ItemDto itemDto, @PathVariable Integer id){
            ItemDto itemDto1 = serviceInventory.updateitem(itemDto,id);
            return  new ResponseEntity<ItemDto>(itemDto1,HttpStatus.CREATED.OK);
    }
 @DeleteMapping("/deleteItemById/{id}")
    public  String deleteItem(@PathVariable Integer id){
        serviceInventory.deleteitem(id);
        return "Sucessfully Deleted";
 }
//@GetMapping("/getItemsByName/{item}")
//    public ResponseEntity

}
