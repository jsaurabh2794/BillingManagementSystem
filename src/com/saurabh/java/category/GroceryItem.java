package com.saurabh.java.category;

import com.saurabh.java.taxes.TaxTypeB;

public class GroceryItem extends Item implements TaxTypeB {

	private double price;
	public GroceryItem(String itemName, String itemCategory, int itemQuantity, double price) {
		super(itemName, itemCategory, itemQuantity);
		this.price = price;
	}

	@Override
	public double getTotalPrice() {
		double totalPrice = price*this.getItemQuantity();
		return totalPrice - ((totalPrice* TAX_FOR_TYPE_B)/100);
	}

	@Override
	public double getTaxApplied() {
		return TAX_FOR_TYPE_B;
	}

	@Override
	public double getItemPrice() {
		
		return this.price;
	}
	
	
}
