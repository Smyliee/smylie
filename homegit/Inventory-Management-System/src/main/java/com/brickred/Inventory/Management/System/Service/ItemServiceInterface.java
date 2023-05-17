package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemServiceInterface {

    public List<ItemDto>getAllItems();
    public ItemDto createitem(ItemDto itemdto);
    public ItemDto updateitem(ItemDto itemDto, Integer id) throws Throwable;

    public void  deleteitem( Integer id);

    public ItemDto findItemDetailsByName(String itemName);
 public List<ItemDto>getItemBySortByRating();

}


