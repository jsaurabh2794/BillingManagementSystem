package com.saurabh.java.manager;

import java.util.ArrayList;

import com.saurabh.java.category.Item;

public class OrderManager {

	private ArrayList<Item> items;
	
	public ArrayList<Item> addItemsToCart(Item item) {
		
		if(items == null) {
			items = new ArrayList<Item>();
		}
		items.add(item);
		
		return items;
	}

	public ArrayList<Item> getItemsFromCart() {
		return items;
	}
}
