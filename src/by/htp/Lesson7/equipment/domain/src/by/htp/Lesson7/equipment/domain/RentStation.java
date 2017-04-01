package by.htp.Lesson7.equipment.domain;

public class RentStation {
	private int currentSize = 1;
	private int newSize;
	private int size = 1;
	private int position = 0;

	Equipment equpmentStock[] = new Equipment[size];

	private int checkCurSize(Equipment vehicleArray[]) {// check curent size
		int curentSize = 0;
		for (Equipment e : equpmentStock) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		return curentSize;
	}

	public Equipment[] getEqupmentStock() {
		int i = 0;
		if (equpmentStock[i] == null) {
			System.out.println("No any eqipments ");
		} else {
			if (equpmentStock[i] != null) {
				for (i = 0; i < checkCurSize(equpmentStock); i++) {

					System.out.println("Item: " + equpmentStock[i].getBrand() + " by price "
							+ equpmentStock[i].getHourlyPrice() + " from category: " + equpmentStock[i].getCategory());
				}
			}
		}
		return equpmentStock;
	}

	public Equipment[] addItemToStock(Equipment equipment) {
		for (int j = 0; j < equpmentStock.length; j++) {
			if (equpmentStock[j] == null) {
				position = j;
				j = equpmentStock.length;
			} else if (j >= position) {
				// increase array capacity it current too small
				newSize = (currentSize * 3) / 2 + 1;
				Equipment equpmentStockExtended[] = new Equipment[newSize];
				for (int i = 0; i < equpmentStock.length; i++) {
					equpmentStockExtended[i] = equpmentStock[i];
				}
				currentSize = newSize;
				equpmentStock = equpmentStockExtended;
			}
		}
		equpmentStock[position] = equipment;
		return equpmentStock;
	}

}
