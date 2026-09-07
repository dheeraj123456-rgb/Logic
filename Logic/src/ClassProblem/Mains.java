package ClassProblem;

interface foodOrder{
	void preparedFood();
}

class orderDetails{
	int orderId;
	String costomerName;
	double price;
	
	orderDetails(int orderId,String costomerName,double price){
		this.orderId = orderId;
		this.costomerName = costomerName;
		this.price = price;
	}
	
	void orderdisplayDetails() {
		System.out.println("order id = " + orderId);
		System.out.println("Costomer name = " + costomerName);
		System.out.println("price = " + price);
	}
}

class pizzaOrder extends orderDetails implements foodOrder{
	pizzaOrder(int orderId , String costomerName, double price){
		super(orderId , costomerName,price);
	}
	@Override
	public void preparedFood() {
		System.out.println("Preparing pizzaa ......");
	}
}

class burgerOrder extends orderDetails implements foodOrder{
	burgerOrder(int orderId,String costomerName,double price){
		super(orderId,costomerName,price);
	}
	@Override
	public void preparedFood() {
		System.out.println("Burger preparing .....");
	}
}
public class Mains {

	public static void main(String[] args) {
		orderDetails order;
		order = new pizzaOrder(101,"Dheeraj sharma",530.00);
		order.orderdisplayDetails();
		foodOrder food = (foodOrder) order;
		food.preparedFood();
		
		System.out.println("...........X...............");
		
		order = new burgerOrder(102,"Suraj",60.00);
		order.orderdisplayDetails();
	    food = (foodOrder) order;
		food.preparedFood();

	}

}
