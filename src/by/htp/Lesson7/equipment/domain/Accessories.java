package by.htp.Lesson7.equipment.domain;

public abstract class Accessories extends Goods {
	private String color;
	private String brand;
	private String name;
	private double price;
	private AccessoriesType type;


	public Accessories(String brand, String name, String color, double price, AccessoriesType type) {
		this.color = color;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double isPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public AccessoriesType getType() {
		return type;
	}

	public void setType(AccessoriesType type) {
		this.type = type;
	}

}
