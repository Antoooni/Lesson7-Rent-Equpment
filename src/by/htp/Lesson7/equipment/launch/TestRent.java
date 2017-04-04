package by.htp.Lesson7.equipment.launch;

import by.htp.Lesson7.equipment.domain.Accessories;
import by.htp.Lesson7.equipment.domain.AccessoriesType;
import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Client;
import by.htp.Lesson7.equipment.domain.Equipment;
import by.htp.Lesson7.equipment.domain.Goods;
import by.htp.Lesson7.equipment.domain.RentStation;
import by.htp.Lesson7.equipment.domain.Ski;
import by.htp.Lesson7.equipment.domain.SkiAccessories;
import by.htp.Lesson7.equipment.domain.Snowboard;
import by.htp.Lesson7.equipment.domain.SnowboardAccessories;
import by.htp.Lesson7.equipment.service.RentStationService;
import by.htp.Lesson7.equipment.service.RentStationServiceImpl;

public class TestRent {

	public static void main(String[] args) {
		//equipment
		Equipment eq1 = new Ski("Fisher" ,Category.ADULT, 25.0, false);		
		Equipment eq2 = new Ski("Volkl",Category.CHILD,30.0, false);		
		Equipment eq3 = new Snowboard("Burton",Category.ADULT,27.5, false);		
		Equipment eq4 = new Snowboard("Flow",Category.ADULT,40, false);
		Equipment eq5 = new Snowboard("Fisher",Category.CHILD, 20,false);
		
		//Accessories
		Accessories as1 =new SkiAccessories("Atomic","gloves","white",10.0, AccessoriesType.CLOTHES, false);
		Accessories as2 =new SkiAccessories("gopro","hero 4","black",25,AccessoriesType.OTHER, false);
		Accessories as3 =new SnowboardAccessories("Trespass", "no name","green", 5, AccessoriesType.PROTECTION, false);
		
		RentStation stock= new RentStation();
		stock.addItemToStock(eq1);
		stock.addItemToStock(eq2);
		stock.addItemToStock(eq3);
		stock.addItemToStock(eq4);
		stock.addItemToStock(eq5);
		stock.addItemToStock(as1);
		stock.addItemToStock(as2);
		stock.addItemToStock(as3);
		// Service s= new Service(rentStation);
		
		RentStationService rentStationSevice = new RentStationServiceImpl(stock);
		rentStationSevice.show();
		
		String findBrand = "Fisher";
		Goods [] found=rentStationSevice.searchItem(findBrand, false);
		
		Client c1= new Client();
		c1.setName("name");
		c1.setId(12345678);
		c1.getRentedClientGoods();
		Goods [] addedClientGoods=	c1.addRentedGoods(found); // client rented items
		// need add implementation show rented items
		Goods [] allAvailableGoods=	stock.pickUpRented(found ); //whole stock without rented goods
		// need add implementation show allAvailableGoods

	}

}
