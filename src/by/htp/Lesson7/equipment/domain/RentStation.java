package by.htp.Lesson7.equipment.domain;

public /**/final class RentStation {
	private int currentSize = 1;
	private int newSize;
	private int size = 1;
	private int positionBeforeNull = 0;
	

	private Goods equpmentStock[] = new Goods[size];

	public Goods[] getEqupmentStock() {
		return equpmentStock;
	}

	public Goods[] addItemToStock(Goods goods) {
		for (int j = 0; j < equpmentStock.length; j++) {
			if (equpmentStock[j] == null) {
				positionBeforeNull = j;
				j = equpmentStock.length;
			} else if (j >= positionBeforeNull) {
				// increase array capacity if current too small
				newSize = currentSize + 1;
				Goods equpmentStockExtended[] = new Goods[newSize];
				for (int i = 0; i < equpmentStock.length; i++) {
					equpmentStockExtended[i] = equpmentStock[i];
				}
				currentSize = newSize;
				equpmentStock = equpmentStockExtended;
			}
		}
		equpmentStock[positionBeforeNull] = goods;
		return equpmentStock;
	}



	public Goods[] pickUpRented( Goods[] rented) {
		int curSize=equpmentStock.length;
		for(int i =0; i<equpmentStock.length;i++){
			for(int j=0; j<rented.length; j++){
				if(rented[j].getBrand()==equpmentStock[i].getBrand()){
					equpmentStock[i].setRented(true);
					curSize=curSize-1;
					break;
				}
			}
		}
		
		Goods equpmentStockNoRented[] = new Goods[curSize];//no rented Goods
		int j =0;
		for(int i=0; i<equpmentStock.length;i++){
			if(equpmentStock[i].isRented()==false){
				equpmentStockNoRented[j]=equpmentStock[i];
				j=j+1;
			}
		}
		return equpmentStockNoRented;
	}

}
