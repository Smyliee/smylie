package com.Brickred.Inventory.Repository;

import com.Brickred.Inventory.Entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRespository extends JpaRepository<Items,Integer> {
}
