package com.brickred.Inventory.Management.System.Service;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Dto.VendorDto;
import com.brickred.Inventory.Management.System.Entity.Item;
import com.brickred.Inventory.Management.System.Entity.Vendor;
import com.brickred.Inventory.Management.System.Exception.ResourceNotFoundException;
import com.brickred.Inventory.Management.System.Repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemIplementation implements ItemServiceInterface {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ItemDto> getAllItems() {
        List<Item> items = itemRepository.findAll();
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(Item i: items){
            itemDtoList.add(this.modelMapper.map(i,ItemDto.class));
        }
        return itemDtoList;

    }

    @Override
    public ItemDto createitem(ItemDto itemDto) {
        Item item =this.modelMapper.map(itemDto, Item.class);
        Item addItem= this.itemRepository.save(item);
        return this.modelMapper.map(addItem, ItemDto.class);
    }

    @Override
    public ItemDto updateitem(ItemDto itemDto, Integer id) {
        Item item = this.itemRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Item", "Item Id", id));
        item.setItemName(itemDto.getItemName());
        item.setItemCapacity(itemDto.getItemCapacity());
        item.setItemRating(itemDto.getItemRating());
        item.setItemArticleId(itemDto.getItemArticleId());
        this.itemRepository.save(item);
        ItemDto itemDto1=this.modelMapper.map(item,ItemDto.class);
        return  itemDto1;
    }

    @Override
    public ItemDto findItemDetailsByName(String itemName) {
        Item item1= itemRepository.findByItemName(itemName);
        return this.modelMapper.map(item1,ItemDto.class);
    }

    @Override
    public List<ItemDto> getItemBySortByRating() {
        List<Item> items = itemRepository.SortByRating();
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(Item i: items){
            itemDtoList.add(this.modelMapper.map(i,ItemDto.class));
        }
        return itemDtoList;
    }

    @Override
    public void deleteitem( Integer id) {
        this.itemRepository.deleteById(id);
    }
}
