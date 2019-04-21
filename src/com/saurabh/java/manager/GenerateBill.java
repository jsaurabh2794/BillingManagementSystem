package com.saurabh.java.manager;

import java.util.ArrayList;

import com.saurabh.java.category.Item;

public class GenerateBill {

	public static void generateBillForItems(ArrayList<Item> item) {
		printHeader();
		for(Item newItem: item) {
			System.out.println(newItem.getItemName()+"\t\t"+newItem.getItemQuantity()+"\t\t"+newItem.getItemPrice()+"\t"+newItem.getTaxApplied()+"\t\t"+newItem.getTotalPrice());
		}
		getTotalCalculation(item);
		getTotalCost(item);
	}

	public static void getTotalCalculation(ArrayList<Item> item) {
		System.out.println("\t\t\t\t\t-------\t\t--------");
		System.out.println("\t\t\t\t\t"+"Total:"+getTotalTax(item)+"\t"+"Total:"+getTotalCost(item));
	}

	public static void printHeader() {
		System.out.println("\n\n--------------------Bill----------------------------------");
		System.out.printf("ItemName\tItemQuantity\tPrice\tTaxPercent\tTotalPrice\n");
	}

	public static double getTotalCost(ArrayList<Item> item) {
		double totalPrice=0.0;
		for(Item newItem: item) {
			totalPrice = totalPrice + newItem.getTotalPrice();
		}
		return totalPrice;
	}
	
	public static double getTotalTax(ArrayList<Item> item) {
		double totalTax=0.0;
		for(Item newItem: item) {
			totalTax = totalTax + newItem.getTaxApplied();
		}
		return totalTax;
	}
}
