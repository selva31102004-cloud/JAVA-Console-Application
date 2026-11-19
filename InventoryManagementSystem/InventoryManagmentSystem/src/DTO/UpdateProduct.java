package DTO;

import java.util.Map;
import java.util.Scanner;

public class UpdateProduct {
	Scanner sc=new Scanner(System.in);
	Display display=new Display();
	Product value;
	String id;
	public void updateProduct(Map<String, Product>product) {
		if(product.isEmpty()) {
			System.out.println("NO Product Avalable Please Add Product Later Update");
			return;
		}
		
		boolean whilerun=true;
		while(whilerun) {
			System.out.println("Updating Prodct ID (ex po1,po2....): ");
			id=sc.next();
		     value=product.get(id);
			if(value==null) {
				System.out.println("Invalide Product Id please Enter Correct Id...!");
				display.displayProduct(product);
			}
			else whilerun=false;
		}
		sc.nextLine();
		while(true) {
			display.displayUpdatingProduct();
			System.out.println("Enter Your Choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter New Price: ");
				long price=sc.nextLong();
				value.setPrice(price);
				System.out.println("Price Update Successfully...!");
				return;
			case 2:
				System.out.println("Enter New Discount: ");
				int discount=sc.nextInt();
				value.setDiscodunt(discount);
				System.out.println("Discount Update Successfully...!");
				return;
			case 3:
				System.out.println("Ingress Stock: ");
				int stock=sc.nextInt();
				value.setStack(value.getStack()+stock);
				System.out.println("Stock Ingress Successfully...!");
				return;
			case 4:
				System.out.println("How Many Product Damage:");
				int damage=sc.nextInt();
				if(value.getStack()>=damage) {
					value.setStack(value.getStack()-damage);
					System.out.println("Dispose Damage Stock.......");
				}
				else System.out.println("Low Stock Avalable Please Check Stock First");
				return;
			case 5:
				System.out.println("Change Produc Name: ");
				String name=sc.next();
				value.setProductName(name);
				System.out.println("Change Name Successfully...!");
				return;
			case 6:
				product.remove(id);
				System.out.println("Remove Product Successfully...!");
				return;
			case 7:
				 return;
			default:
				System.out.println("Please Choice Correct Choice..!");
			}
		}
	}
}
