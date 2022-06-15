package com.springrest.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.food.model.Food;

public interface FoodDao extends JpaRepository<Food,Integer> {

    Food findByfoodName(String name);
}
