package by.htp.Lesson7.equipment.service;

import by.htp.Lesson7.equipment.domain.RentUnit;

public interface RentStationService {

	void show();

	RentUnit[] searchItem(String brand, boolean isRented);

}
