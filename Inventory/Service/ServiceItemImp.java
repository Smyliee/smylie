package com.Brickred.Inventory.Service;

import com.Brickred.Inventory.DTO.InventoryDto;
import com.Brickred.Inventory.DTO.ItemDto;
import com.Brickred.Inventory.Entities.Items;
import com.Brickred.Inventory.Repository.ItemRespository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceItemImp implements ServiceItems {
    @Autowired
    private ItemRespository itemRespository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ItemDto> getAllItems() {
        List<Items> items = itemRespository.findAll();
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(Items i: items){
            itemDtoList.add(this.modelMapper.map(i,ItemDto.class));
        }
        return itemDtoList;

    }

    @Override
    public ItemDto createitem(@Valid ItemDto itemDto) {
        Items item =this.modelMapper.map(itemDto, Items.class);
        Items addItem= this.itemRespository.save(item);
        return this.modelMapper.map(addItem, ItemDto.class);
    }

    @Override
    public ItemDto updateitem(ItemDto itemDto, Integer id) {
        Items item = this .itemRespository.findById(id).orElseThrow();
        item.setItemName(itemDto.getItemName());
        item.setItemCapacity(itemDto.getItemCapacity());
        item.setItemRating(itemDto.getItemRating());
        item.setItemArticleId(itemDto.getItemArticleId());
        this.itemRespository.save(item);
        ItemDto itemDto1=this.modelMapper.map(item,ItemDto.class);
        return  itemDto1;
    }

    @Override
    public void deleteitem( Integer id) {
        this.itemRespository.deleteById(id);
    }
//    @Override
//    public ItemDto getItemDetailsByName(String item) {
//        List<Items> items = itemRespository.findAll();
//        List<ItemDto> itemDtoList = new ArrayList<>();
//    }
}
