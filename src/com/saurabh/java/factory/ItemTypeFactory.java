package com.saurabh.java.factory;

import com.saurabh.java.category.CosmeticItem;
import com.saurabh.java.category.FoodItem;
import com.saurabh.java.category.GroceryItem;
import com.saurabh.java.category.Item;

public class ItemTypeFactory {

	public Item getItemType(String itemName, String itemCategory, int itemQuantity) {

		Item item = null;
		switch (itemCategory) {
		case "FoodItem":
			item = new FoodItem(itemName, itemCategory, itemQuantity, getPriceForItem(itemCategory));
			break;
		case "CosmeticItem":
			item = new CosmeticItem(itemName, itemCategory, itemQuantity,  getPriceForItem(itemCategory));
			break;
		case "GroceryItem":
			item = new GroceryItem(itemName, itemCategory, itemQuantity,  getPriceForItem(itemCategory));
			break;
		}

		return item;
	}

	public double getPriceForItem(String Category) {
		double price = 0;

		switch (Category) {
		case "FoodItem":
			price = 15.0;
			break;
		case "CosmeticItem":
			price = 20.0;
			break;
		case "GroceryItem":
			price = 30.0;
			break;
		}
		return price;

	}

}
