package com.saurabh.java.shop;

import java.util.ArrayList;
import java.util.Scanner;

import com.saurabh.java.category.Item;
import com.saurabh.java.factory.ItemTypeFactory;
import com.saurabh.java.manager.GenerateBill;
import com.saurabh.java.manager.OrderManager;

public class ShopKeeper {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String addMoreItem = "Y" ;
		 
		 String itemName;
		 int itemCategory;
		 String itemCategoryName;
		 int itemQuantity;
		
		 OrderManager ordermanager = new OrderManager();
		 ItemTypeFactory factory = new ItemTypeFactory();
		 
		 ArrayList<Item> items;
		 
		 while (addMoreItem.equalsIgnoreCase("Y")) {
			System.out.println("---------------------------------------");
			 System.out.printf("Please enter item name: ");
			 itemName = input.next();
			 
			 System.out.println("\nPlease choose your Item Category:");
			 System.out.println("1. Food Item");
			 System.out.println("2. Cosmetic Item");
			 System.out.println("3. Grocery Item");
			 System.out.printf("Enter you option here: ");
			 itemCategory = input.nextInt();
			 
			 itemCategoryName = getItemCatgoryName(itemCategory);
			
			 System.out.printf("\nPlease enter your quantity: ");
			 itemQuantity = input.nextInt();
			 
			 Item item = factory.getItemType(itemName, itemCategoryName, itemQuantity);
			 ordermanager.addItemsToCart(item);
			 
			 System.out.printf("\nWant to add more? Y/N : ");
			 addMoreItem = input.next();
		}
		 
		 GenerateBill.generateBillForItems(ordermanager.getItemsFromCart());
	}

	public static String getItemCatgoryName(int itemCategory) {
		String itemCategoryName = null;
		if(itemCategory == 1) {
			 itemCategoryName = "FoodItem";
		 }else if(itemCategory == 2) {
			 itemCategoryName = "CosmeticItem";
		 }else if(itemCategory == 3)
		 {
			 itemCategoryName = "GroceryItem";
		 }
		return itemCategoryName;
	}

}
