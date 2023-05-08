package com.Brickred.Inventory.Repository;

import com.Brickred.Inventory.Entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRespository extends JpaRepository<Items,Integer> {
}
