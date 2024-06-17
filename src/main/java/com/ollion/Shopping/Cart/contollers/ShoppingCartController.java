package com.ollion.Shopping.Cart.contollers;


import com.ollion.Shopping.Cart.DTOs.Item;
import com.ollion.Shopping.Cart.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping("/cart/getAllItems")
    public List<Item> getAllItems(){
        return shoppingCartService.getAllItems();

    }

    @PostMapping("/cart/addItem")
    public String addItem(@RequestBody Item item){
        shoppingCartService.addItem(item);
        return "Item Added successfull";
    }


}
