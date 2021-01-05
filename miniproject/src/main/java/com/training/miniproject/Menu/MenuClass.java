package com.training.miniproject.Menu;

public class MenuClass {
	
	private String itemCode;
	private String type;
	private String name;
	private Integer price;
	public MenuClass(String itemCode,String type, String name, Integer price) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.itemCode = itemCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
