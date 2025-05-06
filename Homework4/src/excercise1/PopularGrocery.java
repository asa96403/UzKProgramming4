package excercise1;

public abstract class PopularGrocery extends GroceryItem{
	protected int popularityLevel;
	protected int quantity;
	
	public PopularGrocery(int popularityLevel) {
		isPopular=true;
		this.popularityLevel = popularityLevel;
	}
	
	@Override
	public boolean showWarning() {
		if(quantity > householdLimit) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//GETTERS AND SETTERS
	public int getPopularityLevel() {
		return popularityLevel;
	}

	public void setPopularityLevel(int popularityLevel) {
		this.popularityLevel = popularityLevel;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
