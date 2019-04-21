package com.saurabh.java.category;

public class Item {

	private String itemName;
	private String itemCategory;
	private int itemQuantity;
	
	
	public Item(String itemName, String itemCategory, int itemQuantity) {
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.itemQuantity = itemQuantity;
		
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}


    public double getTotalPrice() {
		return 0.0;
    }
	
    public double getTaxApplied() {
		return 0.0;
    }

    public double getItemPrice() {
    	return 0.0;
    }
	
	
}
