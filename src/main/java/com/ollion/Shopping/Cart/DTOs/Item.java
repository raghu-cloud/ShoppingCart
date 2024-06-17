package com.ollion.Shopping.Cart.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {

    //id, name, price, and quantity.

    private int id;
    private String name;
    private String quantity;
}
