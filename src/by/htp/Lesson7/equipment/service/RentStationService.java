package by.htp.Lesson7.equipment.service;

import by.htp.Lesson7.equipment.domain.Goods;

public interface RentStationService {

	void show();

	Goods[] searchItem(String brand, boolean isRented);

}
