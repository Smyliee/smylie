package com.brickred.Inventory.Management.System.Repository;


import com.brickred.Inventory.Management.System.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    //  @Query("select s from Student s where s.name = ?1")
//  List<Student> getStudents(String name);
    @Query("select i from Inventory i where i.inventoryCity =:inventoryCity")
    public List<Inventory> findByCityName(String inventoryCity);
////public Item findByName(String itemName);

    @Query("Select i from Inventory i where i.inventoryCity =:inventoryCity")
    public List<Inventory> getTotalInventoryCapacityofCity(String inventoryCity);

    @Query("Select i.inventoryName from Inventory i  ORDER BY i.inventoryCapacity")
    public List<String> sortListByCapacity();

}