package com.Brickred.Inventory.Service;

import com.Brickred.Inventory.DTO.InventoryDto;
import com.Brickred.Inventory.DTO.ItemDto;

import java.util.List;

public interface ServiceItems {

public List<ItemDto>getAllItems();
public ItemDto createitem(ItemDto itemdto);
public ItemDto updateitem(ItemDto itemDto, Integer id);

public void  deleteitem( Integer id);

//public ItemDto getItemDetailsByName(String str);

    //    @Override
    //    public Items getItemsById(Integer id){
    //        return itemRespository.findById( Integer id);
    //    }
//    ItemDto createitem(ItemDto itemdto);

//public  Items getItemsById(Integer id);
}
