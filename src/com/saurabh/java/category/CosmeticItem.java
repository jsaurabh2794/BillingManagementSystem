package com.saurabh.java.category;

import com.saurabh.java.taxes.TaxTypeA;
import com.saurabh.java.taxes.TaxTypeB;

public class CosmeticItem extends Item implements TaxTypeA, TaxTypeB {

	private double price;
	public CosmeticItem(String itemName, String itemCategory, int itemQuantity, double price) {
		super(itemName, itemCategory, itemQuantity);
		this.price = price;
		
	}
	@Override
	public double getTotalPrice() {
		double totalPrice = price*this.getItemQuantity();
		double price = totalPrice - ((totalPrice * TAX_FOR_TYPE_A)/100);
		totalPrice = totalPrice - ((totalPrice * TAX_FOR_TYPE_B)/100);
		 return totalPrice;
	}
	
	@Override
	public double getTaxApplied() {
		return TAX_FOR_TYPE_A + TAX_FOR_TYPE_B;
	}
 
  
	@Override
	public double getItemPrice() {
		
		return this.price;
	}
	
}
