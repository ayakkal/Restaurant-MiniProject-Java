package com.training.miniproject.Menu;

import java.util.Scanner;

public class MenuFunctionality {
	
	Scanner sc =  new Scanner(System.in);
	MenuInitializerClass menuinitializer;
	
	public MenuFunctionality() {
		this.menuinitializer = new MenuInitializerClass();
	}
	
	public void addItem() {
			
		System.out.println("Enter the code: ");
		String code = sc.nextLine();
		System.out.println("Enter the type: ");
		String type = sc.nextLine();
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Price: ");
		Integer price = sc.nextInt();
	
		this.menuinitializer.addItem(code, type, name, price);
		
		System.out.println("Successfully added the Item ");
			
	}
	
	public void editItem() {
		showItems();
		
		System.out.println("Enter the code from the above list: ");
		String code = sc.nextLine();
		System.out.println("Enter the Price: ");
		Integer price = sc.nextInt();
		
		this.menuinitializer.editItem(code, price);
		
		System.out.println("Successfully edited the Item ");
			
	}
	
	public void removeItem() {
		
		showItems();
		System.out.println("Enter the code from the above list: ");
		String code = sc.nextLine();

		this.menuinitializer.removeItem(code);
		
		System.out.println("Item removed successfully ");
			
	}
	
	public void showItems() {
		
		System.out.println("The list of item is :  ");
		for(MenuClass menu : this.menuinitializer.getItemObjs()) {
			
			System.out.println(" *  Code : "+ menu.getItemCode() +" , Type : " + menu.getType() +" , Name : "
			+ menu.getName()+ " , Price : " + menu.getPrice());
		
		}
			
	}

}
