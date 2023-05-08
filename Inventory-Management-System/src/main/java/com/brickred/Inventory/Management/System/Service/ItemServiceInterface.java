package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;

import java.util.List;

public interface ItemServiceInterface {

    public List<ItemDto> getAllItems();
    public ItemDto createitem(ItemDto itemdto);
    public ItemDto updateitem(ItemDto itemDto, Integer id);

    public void  deleteitem( Integer id);

}
