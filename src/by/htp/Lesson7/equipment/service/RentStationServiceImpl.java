package by.htp.Lesson7.equipment.service;

import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Goods;
import by.htp.Lesson7.equipment.domain.RentStation;

public class RentStationServiceImpl implements RentStationService {
	private final RentStation station;
	
	public RentStationServiceImpl(RentStation station) {
		super();
		this.station = station;
	}
	@Override
	public  void show() {
		{
			int i = 0;
			if (station == null) {
				System.out.println("No any eqipments ");
			} else {
				if (station != null) {
					System.out.println("Whole available stock: ");
					Goods [] equpmentStock = station.getEqupmentStock();
					for (i = 0; i < checkCurSize(equpmentStock); i++) {
						 System.out.print("Item: " +
						 equpmentStock[i].getBrand() + " by price "
						 + equpmentStock[i].getPrice() + " from category: "/* + equpmentStock[i].getCategory()+" or "+equpmentStock[i].getType()*/);
						//
						 if(equpmentStock[i].getCategory() instanceof Category){
							 System.out.print(equpmentStock[i].getCategory());
						 }
						 else{
							 System.out.print(equpmentStock[i].getType());
						 }
						 System.out.println();
						 //
					}
				}
			}
		}
	}
	private final int checkCurSize(Goods[] equpmentStock) {// check current size
		int curentSize = 0;
		for (Goods e : equpmentStock) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		return curentSize;
	}
	@Override
	public Goods[] searchItem(String brand, boolean isRented) {
		Goods equpmentStockFound[] = new Goods[station.getEqupmentStock().length];
		int j = 0;
		Goods[] equpmentStock = station.getEqupmentStock();
		for (int i = 0; i < equpmentStock.length; i++) {
			if (equpmentStock[i] != null) {
				if (equpmentStock[i].getBrand() == brand&&equpmentStock[i].isRented()==isRented) {
					equpmentStockFound[j] = equpmentStock[i];
					j = j + 1;// save index !=null
				}
			}
		}
		Goods equpmentStockFoundNew[] = new Goods[j];
		for (int i = 0; i < equpmentStockFound.length; i++) {
			if (equpmentStockFound[i] != null) {
				equpmentStockFoundNew[i] = equpmentStockFound[i];
			}
		}
		return equpmentStockFoundNew;
	}
}
