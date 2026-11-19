package DTO;

import java.util.Scanner;

public class Product {
	private String productId;
	private String ProductName;
	private long price;
	private int stack;
	private int discodunt;
	Scanner sc=new Scanner(System.in);
	public Product(String productId) {
		this.productId=productId;
		System.out.println("Enter Product Name: ");
		ProductName=sc.next();
		sc.nextLine();
		System.out.println("Enter Product price: ");
		price=sc.nextLong();
		System.out.println("Enter Current Stack: ");
		stack=sc.nextInt();
		System.out.println("Product Discount: ");
		discodunt=sc.nextInt();
		System.out.println("Product Add Successfully...!");
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getStack() {
		return stack;
	}
	public void setStack(int stack) {
		this.stack = stack;
	}
	public int getDiscodunt() {
		return discodunt;
	}
	public void setDiscodunt(int discodunt) {
		this.discodunt = discodunt;
	}
	
}
