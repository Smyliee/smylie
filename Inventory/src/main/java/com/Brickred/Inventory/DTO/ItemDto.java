package com.Brickred.Inventory.DTO;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDto {
    private  Integer itemid;

    private String itemName;

    private Integer quantity;

    private Integer quantityperpiece;

    private Integer totalprice;

}
