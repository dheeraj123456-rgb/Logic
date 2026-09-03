package ClassProblem;

class Vhicle {
	int speed = 50;
	
	void display() {
		System.out.println("Vhicle speed " + speed);
	}
}

class Carss extends Vhicle{
	int speed = 100;
	
	@Override
	void display() {
		System.out.println("Car speed " + speed);
	}
}

public class Main {

	public static void main(String[] args) {
		Vhicle v = new Carss();
		
		System.out.println("Speed : " + v.speed);
		
		v.display();

	}

}
