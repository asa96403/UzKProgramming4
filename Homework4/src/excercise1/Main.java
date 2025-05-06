package excercise1;

public class Main {
	public static void main(String[] args) {
		PopularGrocery[] purchase = new PopularGrocery[6];
		Milk milch1 = new Milk(10, 7, 8);
		Milk milch2 = new Milk(25, 10, 8);
		Milk milch3 = new Milk(5, 6, 8);
		Flour mehl1 = new Flour(10, 3, 9);
		Flour mehl2 = new Flour(6, 6, 9);
		Flour mehl3 = new Flour(16, 15, 9);
		purchase[0]=milch1;
		purchase[1]=milch2;
		purchase[2]=milch3;
		purchase[3]=mehl1;
		purchase[4]=mehl2;
		purchase[5]=mehl3;
		testProducts(purchase);
	}
	public static void testProducts(PopularGrocery[] groceries) {
		for(int i=0; i<groceries.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("Purchase ").append(i).append(": ");
			if(groceries[i] instanceof Milk) {
				sb.append("Milk, quantity: ");
			} else if (groceries[i] instanceof Flour) {
				sb.append("Flour, quantity: ");
			}
			sb.append(groceries[i].getQuantity()).append(", discount from: ").append(groceries[i].getDiscountThreshold()).append(" items");
			System.out.println(sb.toString());
			System.out.println("discount:" + groceries[i].getBulkDiscount());
			if(groceries[i].showWarning()) {
				System.out.println("You purchased too many items! No household needs that many.");
			} else {
				System.out.println("The quantity of purchased items is fine.");
			}
			System.out.println("--------------------------------------------");
		}
	}

}

