package com.ollion.Shopping.Cart.repositories;


import com.ollion.Shopping.Cart.entities.ItemEntity;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ItemEntity,Integer> {

}
