package ClassProblem;

class Vehicles{
	
	void Start() {
		System.out.println("Vhicle is Starting");
	}
}

//
class Car extends Vehicles{
	
	void drive() {
		System.out.println("Car id driving ");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Car car = new Car();
		car.Start();
		car.drive();
		
		

	}

}
