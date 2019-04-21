package com.saurabh.java.category;

import com.saurabh.java.taxes.TaxTypeA;

public class FoodItem extends Item implements TaxTypeA {

	private double price;
	public FoodItem(String itemName, String itemCategory, int itemQuantity, double price) {
		super(itemName, itemCategory, itemQuantity);
		this.price = price;
	}

	@Override
	public double getTotalPrice() {
		double totalPrice = price*this.getItemQuantity();
		return (totalPrice) - ((totalPrice* TAX_FOR_TYPE_A)/100);
	}

	@Override
	public double getTaxApplied() {
		return TAX_FOR_TYPE_A;
	}

	@Override
	public double getItemPrice() {
		
		return this.price;
	}

	
 
	
	
}
