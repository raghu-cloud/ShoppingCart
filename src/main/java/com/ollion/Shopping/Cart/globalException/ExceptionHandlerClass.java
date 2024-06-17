package com.ollion.Shopping.Cart.globalException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler(IDNotFoundException.class)
    public void idNotFoundException(){
        throw new RuntimeException("Item Id not found");
    }

    @ExceptionHandler(ItemExistsInCart.class)
    public void itemAlreadyExistsInCart(){
        throw new RuntimeException("Item already exists in cart");
    }
}
