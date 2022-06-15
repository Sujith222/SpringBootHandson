package com.springrest.food.model;

import javax.persistence.*;


@Entity
@Table(name="food")
public class Food {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)  
    private int id;
    public Food() {
    	
    }
    public Food(int id, String foodName, String type, int price) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.type = type;
		this.price = price;
	}
	private String foodName;  
	private int price;
    private String type;  
    public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    public int getId() {
        return id;
    }
	public void setId(int id) {
        this.id = id;
    }
	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName 
				+ ", type=" + type + ", price=" + price + "]";
	}
}
