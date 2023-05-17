package com.brickred.Inventory.Management.System.Repository;

import com.brickred.Inventory.Management.System.Dto.ItemDto;
import com.brickred.Inventory.Management.System.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

  public Item findByItemName(String itemName);

  @Query("Select i from Item i ORDER BY i.itemRating")
  public List<Item> SortByRating();


}