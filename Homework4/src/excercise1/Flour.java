package excercise1;

public class Flour extends PopularGrocery {

	public Flour(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		this.setQuantity(quantity);
		this.discountThreshold = discountThreshold;
		this.householdLimit = 15;
	}

	@Override
	public int getBulkDiscount() {
		if (getQuantity() >= discountThreshold) {
			return 5;
		} else {
			return 0;
		}
	}

}
