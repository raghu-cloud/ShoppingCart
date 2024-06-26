package com.ollion.Shopping.Cart.mapper;

import com.ollion.Shopping.Cart.DTOs.Item;
import com.ollion.Shopping.Cart.entities.ItemEntity;

public class ItemMapper {

    public static Item getItemDTO(ItemEntity itemEntity){
        return new Item(itemEntity.getId(),
                itemEntity.getName(),
                itemEntity.getQuantity());
    }


    public static ItemEntity getItemEntity(Item item){
        return new ItemEntity(item.getId(),
                item.getName(),
                item.getQuantity());
    }
}
