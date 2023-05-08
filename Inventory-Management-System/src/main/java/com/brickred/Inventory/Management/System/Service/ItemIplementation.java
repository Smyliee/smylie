package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;
import com.brickred.Inventory.Management.System.Entity.Item;
import com.brickred.Inventory.Management.System.Entity.Vendor;
import com.brickred.Inventory.Management.System.Repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemIplementation implements ItemServiceInterface {
    @Autowired
    private ItemRepository itemRespository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ItemDto> getAllItems() {
        List<Item> items = itemRespository.findAll();
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(Item i: items){
            itemDtoList.add(this.modelMapper.map(i,ItemDto.class));
        }
        return itemDtoList;

    }

    @Override
    public ItemDto createitem(ItemDto itemDto) {
        Item item =this.modelMapper.map(itemDto, Item.class);
        Item addItem= this.itemRespository.save(item);
        return this.modelMapper.map(addItem, ItemDto.class);
    }

    @Override
    public ItemDto updateitem(ItemDto itemDto, Integer id) {
        Items item = this .itemRespository.findById(id).orElseThrow();
        item.setItemName(itemDto.getItemName());
        item.setQuantity(itemDto.getQuantity());
        item.setQuantityperpiece(itemDto.getQuantityperpiece());
        item.setTotalprice(itemDto.getQuantity()*itemDto.getQuantityperpiece());
        this.itemRespository.save(item);
        ItemDto itemDto1=this.modelMapper.map(item,ItemDto.class);
        return  itemDto1;
    }

    @Override
    public void deleteitem( Integer id) {
        this.itemRespository.deleteById(id);
    }
    }
}
