package by.htp.Lesson7.equipment.service;

import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentStation;
import by.htp.Lesson7.equipment.domain.RentUnit;

public class RentStationServiceImpl implements RentStationService {
	private  RentStation station; // раньше было private final RentStation station;
	// создать менеджера который является частью станции
	
	public RentStationServiceImpl(Manager stock) {
		super();
		this.station = stock;
	}
//	public RentStationServiceImpl(RentStation stock) {
//		this.station = stock;
//	}
	@Override
	public  void show() {
		{
			int i = 0;
				if (station != null) {
					System.out.println("Whole available stock: ");
					RentUnit [] equpmentStock = station.getEqupmentStock(); //написать метод, который обрезает нули
					for (i = 0; i < checkCurSize(equpmentStock); i++) {
						 System.out.print("Item: " +
						 equpmentStock[i].getBrand() + " by price " //можно написать через toString
						 + equpmentStock[i].getPrice() + " from category: ");
						//
						 if(equpmentStock[i].getCategory() instanceof Category){
							 System.out.print(equpmentStock[i].getCategory());
						 }
						 else{
							 System.out.print(equpmentStock[i].getType());
						 }
						 System.out.println();
				}
			}
		}
	}
	@Override
	public String toString() {
		return "RentStationServiceImpl [station=" + station + "]";
	}
	
	@Override
	public RentUnit[] searchItem(String brand, boolean isRented) {
		RentUnit equpmentStockFound[] = new RentUnit[station.getEqupmentStock().length];
		int j = 0;
		RentUnit[] equpmentStock = station.getEqupmentStock();
		for (int i = 0; i < equpmentStock.length; i++) {
			if (equpmentStock[i] != null) {
				if (equpmentStock[i].getBrand() == brand&&equpmentStock[i].isRented()==isRented) {
					equpmentStockFound[j] = equpmentStock[i];
					j = j + 1;// save index !=null
				}
			}
		}
		RentUnit equpmentStockFoundNew[] = new RentUnit[j];
		for (int i = 0; i < equpmentStockFound.length; i++) {
			if (equpmentStockFound[i] != null) {
				equpmentStockFoundNew[i] = equpmentStockFound[i];
			}
		}
		return equpmentStockFoundNew;
	}
	private final int checkCurSize(RentUnit[] equpmentStock) {// check current size
		int curentSize = 0;
		for (RentUnit e : equpmentStock) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		return curentSize;
	}
}
