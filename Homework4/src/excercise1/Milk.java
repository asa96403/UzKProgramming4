package excercise1;

public class Milk extends PopularGrocery {

	public Milk(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		this.discountThreshold = discountThreshold;
		this.setQuantity(quantity);
		this.householdLimit = 20;
	}

	@Override
	public int getBulkDiscount() {
		if (getQuantity() >= discountThreshold) {
			return 12;
		} else {
			return 0;
		}
	}

}
