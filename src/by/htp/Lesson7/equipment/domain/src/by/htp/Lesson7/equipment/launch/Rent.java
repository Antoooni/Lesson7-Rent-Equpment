package by.htp.Lesson7.equipment.launch;

import by.htp.Lesson7.equipment.domain.Accessories;
import by.htp.Lesson7.equipment.domain.AccessoriesType;
import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Equipment;
import by.htp.Lesson7.equipment.domain.RentStation;
import by.htp.Lesson7.equipment.domain.Ski;
import by.htp.Lesson7.equipment.domain.SkiAccessories;
import by.htp.Lesson7.equipment.domain.Snowboard;
import by.htp.Lesson7.equipment.domain.SnowboardAccessories;

public class Rent {

	public static void main(String[] args) {
		//equipment
		Equipment eq1 = new Ski("Fisher" ,Category.ADULT, 25.0, false);		
		Equipment eq2 = new Ski("Volkl",Category.CHILD,30.0, false);		
		Equipment eq3 = new Snowboard("Burton",Category.ADULT,27.5, false);		
		Equipment eq4 = new Snowboard("Flow",Category.ADULT,40, false);
		Equipment eq5 = new Snowboard("Rossignol",Category.CHILD, 20,false);
		
		//Accessories
		Accessories as1 =new SkiAccessories("Atomic","gloves","white",10.0,AccessoriesType.clothes);
		Accessories as2 =new SkiAccessories("gopro","hero 4","black",22.2,AccessoriesType.other);
		Accessories as3 =new SnowboardAccessories("Trespass", "no name","green", 5, AccessoriesType.protection);
		
		RentStation stock= new RentStation();
		stock.addItemToStock(eq1);
		stock.addItemToStock(eq2);
		stock.addItemToStock(eq3);
		stock.addItemToStock(eq4);
		stock.addItemToStock(eq5);
		//stock.addVehicleToGarage(as1);
		stock.getEqupmentStock();

	}

}
