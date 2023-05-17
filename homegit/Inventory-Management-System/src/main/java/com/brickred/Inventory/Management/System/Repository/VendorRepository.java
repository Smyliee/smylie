package com.brickred.Inventory.Management.System.Repository;

import com.brickred.Inventory.Management.System.Entity.Item;
import com.brickred.Inventory.Management.System.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
