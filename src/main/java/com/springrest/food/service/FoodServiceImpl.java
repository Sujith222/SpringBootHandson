package com.springrest.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.food.dao.FoodDao;
import com.springrest.food.exception.FoodNotFoundException;
import com.springrest.food.model.Food;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements  FoodService {

    @Autowired
    private FoodDao foodDao;
    @Override
    public List<Food> findAll() {
        return foodDao.findAll();
    }
    @Override
    public Optional<Food> findById(int id) {
        return foodDao.findById(id);
    }
    @Override
    public void save(Food food) {
        foodDao.save(food);
    }
    @Override
    public void deleteByid(int id) {
        foodDao.deleteById(id);
    }
	@Override
	public Food getFoodById(int id) {

		Optional option=foodDao.findById(id);
		if(option.isPresent()){
			return (Food) option.get();
		}else
			throw new FoodNotFoundException("id is not found");
	}
	
	
   
}
