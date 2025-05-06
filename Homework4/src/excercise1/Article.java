package excercise1;

public abstract class Article {
	protected int discountThreshold;
	protected int householdLimit;
	
	public abstract int getBulkDiscount();
	public abstract boolean showWarning();
}
