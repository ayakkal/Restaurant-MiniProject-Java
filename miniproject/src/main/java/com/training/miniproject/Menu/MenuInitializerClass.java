package com.training.miniproject.Menu;

import java.util.ArrayList;

public class MenuInitializerClass implements MenuInterface {
	
	ArrayList<MenuClass> itemObjs = new ArrayList<MenuClass>();
	
	public MenuInitializerClass() {
		
		itemObjs.add(new MenuClass("c1","ENTREE","Chilli Shrimp",10));
		itemObjs.add(new MenuClass("c2","MAIN COURSE","Butter Chicken", 12));
		itemObjs.add(new MenuClass("c3","ENTREE","Chicken 65", 9));
		itemObjs.add(new MenuClass("c4","MAIN COURSE","Biryani", 12));
		itemObjs.add(new MenuClass("c5","DESSERT","Barfi", 8));
		itemObjs.add(new MenuClass("c6","SPECIAL","Lamb Roast", 13));
		itemObjs.add(new MenuClass("c7","COMBO","Paneer Curry and Rice", 15));
		itemObjs.add(new MenuClass("c8","DESSERT","Kheer", 7));
		
	}

	public ArrayList<MenuClass> getItemObjs() {
		return itemObjs;
	}


	@Override
	public void addItem(String code, String type, String name, Integer price) {
		
		this.itemObjs.add(new MenuClass(code,type,name,price));
		
	}

	@Override
	public void editItem(String code, Integer price) {
		
		for(MenuClass menu: itemObjs) {
			
			if(code.equals(menu.getItemCode())) {
				menu.setPrice(price);
				break;
			}
			
		}
		
	}

	@Override
	public void removeItem(String code) {
		
		for(MenuClass menu : itemObjs) {
			
			if(code.equals(menu.getItemCode())) {
				itemObjs.remove(menu);
				break;
			}
		}
		
	}

	
}
