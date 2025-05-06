package excercise1;

public abstract class Article {
	protected int discountThreshold;
	protected int householdLimit;
	
	/**
	 * Returns the bulk discount value if the necessary amount of items is purchased
	 * @return the value of the discount in %, 0 if quantity smaller than discountTHreshold
	 * @author aabert
	 */
	public abstract int getBulkDiscount();
	/**
	 * Checks if the amount of items purchased (quantity) is larger than the householdLimit for the particular item
	 * @return true, if quantity larger than householdLimit
	 * @author aabert
	 */
	public abstract boolean showWarning();
	
	//GETTERS AND SETTERS
	public int getDiscountThreshold() {
		return discountThreshold;
	}
	public void setDiscountThreshold(int discountThreshold) {
		this.discountThreshold = discountThreshold;
	}
	public int getHouseholdLimit() {
		return householdLimit;
	}
	public void setHouseholdLimit(int householdLimit) {
		this.householdLimit = householdLimit;
	}
	
	
}
