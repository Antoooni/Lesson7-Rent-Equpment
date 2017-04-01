package by.htp.Lesson7.equipment.domain;

public abstract class Equipment extends Goods {
	private static int MAXITEMS = 3;

	private Category category;
	private double hourlyPrice;
	private String brand;
	private boolean isRented;

	public Equipment(String brand, Category category, double hourlyPrice, boolean isRented) {
		this.brand = brand;
		this.category = category;
		this.hourlyPrice = hourlyPrice;
		this.isRented = isRented;
	}

	public static int getMAXITEMS() {
		return MAXITEMS;
	}

	public static void setMAXITEMS(int mAXITEMS) {
		MAXITEMS = mAXITEMS;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getHourlyPrice() {
		return hourlyPrice;
	}

	public void setHourlyPrice(double hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

}
