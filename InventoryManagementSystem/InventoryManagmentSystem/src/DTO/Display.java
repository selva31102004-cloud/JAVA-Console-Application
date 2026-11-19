package DTO;

import java.util.Map;

public class Display {
	public void displayDasboard() {
		System.out.println("1.Add Product");
		System.out.println("2.Update Product");
		System.out.println("3.Display Product");
	}
	public void displayProduct(Map<String, Product>product) {
		if(product.isEmpty())System.out.println("No Product Found");
		for(var p:product.entrySet()) {
			String key=p.getKey();
			Product value=p.getValue();
			System.out.println("ID: "+key+"   Product Name: "+value.getProductName()+"   Price: "+value.getPrice()+"   Discout: "+value.getDiscodunt()+"   Stock: "+value.getStack());
		}
	}
	public void displayUpdatingProduct() {
		System.out.println("1.Change Price ");
		System.out.println("2.Change Discound");
		System.out.println("3.Ingressing Stock ");
		System.out.println("4.Remove Damage Stock ");
		System.out.println("5.Change Product Name ");
		System.out.println("6.Remove Product in Store");
		System.out.println("7.Exit");
		
	}
}
