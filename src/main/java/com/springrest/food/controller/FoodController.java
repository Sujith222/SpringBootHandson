package com.springrest.food.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springrest.food.exception.FoodNotFoundException;
import com.springrest.food.model.Food;
import com.springrest.food.service.FoodService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foods")
@CrossOrigin
public class FoodController {
    private static  final Logger LOGGER= LoggerFactory.getLogger(FoodController.class);

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getFood(){        
        return foodService.findAll();
    }
    
    @GetMapping("{id}")
    public Optional<Food> getFoodById(@PathVariable int id){      
        Optional<Food> food=foodService.findById(id);
        if(!food.isPresent()){
            throw new FoodNotFoundException("Food not found "+id);
        }
        return food;
    }
    @PostMapping
    public Food addFood(@RequestBody Food food){        
        foodService.save(food);
        return food;
    }

    @PutMapping
    public Food updateFood(@RequestBody Food food){   
        foodService.save(food);
        return food;
    }

    @DeleteMapping("{id}")
    public String deleteFood(@PathVariable int id){
        Optional<Food> food=foodService.findById(id);
        if(!food.isPresent()){
            throw new FoodNotFoundException("Id is not found "+id);
        }
        foodService.deleteByid(id);
        return "Deleted food id ="+id;
    }

   
}
