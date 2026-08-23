package logic23aug;

public class Interface {

	public static void main(String[] args) {
		Rentable vhicle;
		vhicle = new Car();
       
		vhicle.rent();
        System.out.println(vhicle.CalculatePrice(3));
       
        vhicle = new Bike();
        
        vhicle.rent();
        System.out.println(vhicle.CalculatePrice(5));
       
  
        vhicle = new Scotty();
        
        vhicle.rent();
        System.out.println(vhicle.CalculatePrice(4));

	}

}

interface Rentable{
	void rent();
	void returnVhicle();
	double CalculatePrice(int day);
	
}

class Car implements Rentable{
	@Override
   public void rent() {
		System.out.println("Car rented");
	}
	
	@Override
	public void returnVhicle() {
		System.out.println("Car returned");
	}
	
	@Override
	public double  CalculatePrice(int day) {
		return 15000 * day;
	}

}


class Bike implements Rentable {
	
	@Override
	public void rent() {
		 System.out.println("Bike rented");
	}
	
	@Override
	public void returnVhicle() {
		 System.out.println("Return bike");
	}
	
	@Override
	public double CalculatePrice(int day) {
		return day * 500;
	}
}

class Scotty implements Rentable{
	public void rent() {
		System.out.println("Rented scotty");
	}
	
	public void returnVhicle() {
		System.out.println("return scotty");
	}
	
	public double CalculatePrice(int day) {
		return 250 * day;
	}
	
}










