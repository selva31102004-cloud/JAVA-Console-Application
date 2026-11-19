package Main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import DTO.Display;
import DTO.Product;
import DTO.UpdateProduct;

public class Dasboard {
	int productIdInt=1;
	String productIdString="PO";
	Scanner sc=new Scanner(System.in);
	Map<String,Product>product=new LinkedHashMap<>();
	Display display=new Display();
	UpdateProduct updateProduct=new UpdateProduct();
	public Dasboard() {
		while(true) {
			display.displayDasboard();
			System.out.println("Enter Your Choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				String key=productIdString+productIdInt;
				product.put(key,new Product(key));
				break;
			case 2:
				updateProduct.updateProduct(product);
				break;
			case 3:
				display.displayProduct(product);
				break;
			case 4:
				
				break;
				
			}
		}
	}
}
