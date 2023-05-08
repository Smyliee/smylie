package com.Brickred.Inventory.Service;

import com.Brickred.Inventory.DTO.InventoryDto;
import com.Brickred.Inventory.DTO.ItemDto;
import com.Brickred.Inventory.Entities.Inventory;
import com.Brickred.Inventory.Repository.InventoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceInventoryImpl implements ServiceInventory{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public List<InventoryDto> getAllInventories() {
        List <Inventory>inventory = inventoryRepository.findAll();
        List<InventoryDto> inventoryDtoList = new ArrayList<>();
        for(Inventory i: inventory){
            inventoryDtoList.add(this.modelMapper.map(i,InventoryDto.class));
        }
        return inventoryDtoList;
    }
//    Items item =this.modelMapper.map(itemDto, Items.class);
//    Items addItem= this.itemRespository.save(item);
//        return this.modelMapper.map(addItem, ItemDto.class)
    @Override
    public InventoryDto createinventory(InventoryDto inventoryDto) {
        Inventory inventory = this.modelMapper.map(inventoryDto,Inventory.class);
        Inventory addinventory = (Inventory) this.inventoryRepository.save(inventory);
        return this.modelMapper.map((Object) addinventory, (Type) InventoryDto.class);
    }



    @Override
    public InventoryDto updateinventory(InventoryDto inventoryDto, Integer invtid) {
        Inventory inventory;
        inventory = (Inventory) this.inventoryRepository.findById(invtid).orElseThrow();
        inventory.setInventoryName( inventoryDto.getInventoryName());
        inventory.setInventoryCity( inventoryDto.getInventoryCity());
        inventory.setInventoryCapacity( inventoryDto.getInventoryCapacity());
        this.inventoryRepository.save(inventory);
        InventoryDto inventoryDto1=this.modelMapper.map(inventory,InventoryDto.class);
        return  inventoryDto1;
    }

    @Override
    public void deleteinventory(Integer invtid) {
        this.inventoryRepository.deleteById(invtid);

    }
}
