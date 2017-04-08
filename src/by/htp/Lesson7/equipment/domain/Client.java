package by.htp.Lesson7.equipment.domain;

public class Client {
	private String name;
	private int id;
	private RentUnit[] rentedGoods;
	final RentUnit[] rentedClientGoods = new RentUnit[RentUnit.getMAXITEMS()];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RentUnit[] getRentedGoods() {
		return rentedGoods;
	}

	public void setRentedGoods(RentUnit[] rentedGoods) {
		this.rentedGoods = rentedGoods;
	}

	 public RentUnit[] getRentedClientGoods() {
	 return rentedClientGoods;
	 }

	public /*void*/ RentUnit[] addRentedGoods(RentUnit[] found) {
		int curSize = 0;
		for (RentUnit e : found) {
			if (e != null) {
				curSize = curSize + 1;
			}
		}
		for (int i = 0; i < curSize; i++) {
			found[i].setRented(true);
			rentedClientGoods[i] = found[i];
		}
		return rentedClientGoods;
	}

}
