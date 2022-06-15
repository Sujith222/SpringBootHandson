package com.springrest.food;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.springrest.food.dao.FoodDao;
import com.springrest.food.model.Food;
import com.springrest.food.service.FoodService;

@SpringBootTest
public class FoodServiceTest {
	
	@MockBean
    private FoodDao daoMock;

    @Autowired
	private FoodService service1;
    
    @Test
	public void testGetFood() throws SQLException {
    	
    	Food f1=new Food();
		f1.setId(1001);
		f1.setFoodName("pannner");
		Food f2=new Food();
		List <Food> foods=new ArrayList<Food>();
		foods.add(f1);
		foods.add(f2);
    	
    		when(daoMock.findAll()).thenReturn(foods);
    		assertThat(service1.findAll(), hasSize(2));
    	  }

			private List<Food> getTestData() {
				Food f1 = new Food();
				f1.setId(1001);
				f1.setFoodName("panner");
				Food f2 = new Food();
				List<Food> foods = new ArrayList<Food>();
				foods.add(f1);
				foods.add(f2);
				return foods;
			}
}
