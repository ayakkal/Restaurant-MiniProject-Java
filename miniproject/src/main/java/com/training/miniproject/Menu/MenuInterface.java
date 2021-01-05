package com.training.miniproject.Menu;

public interface MenuInterface {

	public void addItem(String code, String type, String name, Integer price);
	public void editItem(String code, Integer price);
	public void removeItem(String code);
	
}
