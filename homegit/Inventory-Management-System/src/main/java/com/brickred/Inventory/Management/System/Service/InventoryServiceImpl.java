package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.InventoryDto;
//import com.brickred.Inventory.Management.System.Repository.InventoryRepository;
import com.brickred.Inventory.Management.System.Entity.Inventory;
import com.brickred.Inventory.Management.System.Repository.InventoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryServiceInterface {
    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<InventoryDto> getAllInventory() {
        List<Inventory> inventories = inventoryRepository.findAll();
        List<InventoryDto> inventoryDtoList = new ArrayList<>();
        for (Inventory i : inventories) {
            inventoryDtoList.add(this.modelMapper.map(i, InventoryDto.class));
        }
        return inventoryDtoList;
    }

    @Override
    public InventoryDto createinventory(InventoryDto inventoryDto) {
        Inventory inventory = this.modelMapper.map(inventoryDto, Inventory.class);
        Inventory addInventory = this.inventoryRepository.save(inventory);
        return this.modelMapper.map(addInventory, InventoryDto.class);
    }

    @Override
    public InventoryDto updateinventory(InventoryDto inventoryDto, Integer id) {
        Inventory inventory = this.inventoryRepository.findById(id).orElseThrow();
        inventory.setInventoryName(inventoryDto.getInventoryName());
        inventory.setInventoryCity(inventoryDto.getInventoryCity());
        inventory.setInventoryCapacity(inventoryDto.getInventoryCapacity());
        this.inventoryRepository.save(inventory);
        InventoryDto inventoryDto1 = this.modelMapper.map(inventory, InventoryDto.class);
        return inventoryDto1;
    }

    @Override
    public void deleteinventory(Integer id) {
        this.inventoryRepository.deleteById(id);
    }

    @Override
    public List<InventoryDto> findInventoryDetailByCityName(String inventoryCity) {
        List<Inventory> inventoryList = inventoryRepository.findByCityName(inventoryCity);
        List<InventoryDto> inventoryDtoList = new ArrayList<>();
        for (Inventory i : inventoryList) {
            inventoryDtoList.add(this.modelMapper.map(i, InventoryDto.class));
        }
        return inventoryDtoList;
    }

    @Override
    public Integer getTotalInventoryCapacityofCity(String inventoryCity) {
        List<Inventory> inventoryList = inventoryRepository.getTotalInventoryCapacityofCity(inventoryCity);
        Integer total = 0;
        for (Inventory i : inventoryList) {
            total += i.getInventoryCapacity();
        }
        return total;
    }

    @Override
    public List<String> sortListByCapacity() {
//        List<Inventory> inventories = inventoryRepository.sortListByCapacity();
//        List<String> list =new ArrayList<>();
//        for (Inventory i :inventories){
//            list.add(this.modelMapper.map(i,InventoryDto.class.getName(inventories.);
//
//        }
//        return list;
        return inventoryRepository.sortListByCapacity();
//    public List<String> sortListByCapacity() {
//        return inventoryRepository.sortListByCapacity();
//    }
    }
}

//    public List<InventoryDto> getInventoryListByInventoryCapacity() {
//            List<Inventory> inventories = inventoryRepository.getInventoryListByInventoryCapacity();
//            List<InventoryDto> inventoryDtoList = new ArrayList<>();
//            for(Inventory i: inventories){
//                inventoryDtoList.add(this.modelMapper.map(i,InventoryDto.class));
//            }
//            return inventoryDtoList;
//        }


