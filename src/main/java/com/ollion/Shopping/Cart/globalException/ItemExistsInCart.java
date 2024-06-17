package com.ollion.Shopping.Cart.globalException;

public class ItemExistsInCart extends RuntimeException {

    ItemExistsInCart(String msg){
        super(msg);
    }
}
