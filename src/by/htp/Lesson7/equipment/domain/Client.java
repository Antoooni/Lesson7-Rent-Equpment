package by.htp.Lesson7.equipment.domain;

public class Client {
	private String name;
	private int id;
	private Goods[] rentedGoods;
	final Goods[] rentedClientGoods = new Goods[Goods.getMAXITEMS()];

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

	public Goods[] getRentedGoods() {
		return rentedGoods;
	}

	public void setRentedGoods(Goods[] rentedGoods) {
		this.rentedGoods = rentedGoods;
	}

	 public Goods[] getRentedClientGoods() {
	 return rentedClientGoods;
	 }

	public /*void*/ Goods[] addRentedGoods(Goods[] found) {
		int curSize = 0;
		for (Goods e : found) {
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
