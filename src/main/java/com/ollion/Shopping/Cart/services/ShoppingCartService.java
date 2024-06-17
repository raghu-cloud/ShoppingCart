package com.ollion.Shopping.Cart.services;

import com.ollion.Shopping.Cart.DTOs.Item;
import com.ollion.Shopping.Cart.entities.ItemEntity;
import com.ollion.Shopping.Cart.repositories.ShoppingCartRepository;
import mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShoppingCartService {


    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public List<Item> getAllItems() {
        List<ItemEntity> items = shoppingCartRepository.findAll();
        return  items.stream()
                .map(item -> ItemMapper.getItemDTO(item))
                .collect(Collectors.toList());
    }

    public void addItem(Item item) {
        ItemEntity itemEntity = ItemMapper.getItemEntity(item);
        shoppingCartRepository.save(itemEntity);
    }
}
