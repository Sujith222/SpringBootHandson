package com.springrest.food.service;

import java.util.List;
import java.util.Optional;

import com.springrest.food.model.Food;

public interface FoodService {

    public List<Food> findAll();
    public Optional<Food> findById(int id);
    public void save(Food food);
    public void deleteByid(int id);
    public Food getFoodById(int id);
    
}
