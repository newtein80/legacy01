package com.lifesoft.legacy01.model.dto;

public class ProductDTO {

	private String name;
    private double price;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
    }
    
	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", price=" + price + "]";
	}
	//기본생성자(ctrl + spasebar 하면 나옴)
	public ProductDTO() {
		
	}
	public ProductDTO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
}