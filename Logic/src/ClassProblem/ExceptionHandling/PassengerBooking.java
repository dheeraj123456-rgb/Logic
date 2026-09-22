package ClassProblem.ExceptionHandling;

public class PassengerBooking {
	public static void main(String[] args) {
		// Passenger id and age as string
		String PassengerId = "101";
		String age = "25";

		// seat number as string
		String seatNumber = "A20";

		// number of passenger as a string '

		int numberOfPassenger = 0;

		// passenger details array
		String[] Passenger = { "Rahul", "Suraj", "Awdhesh" };

		// Different passenger data using string

		Object[] PassengerData = { "Suman", 25, 500.00 };

		// Convert passenger id and age to number

		try {
			int id = Integer.parseInt(PassengerId);
			int PassangerAge = Integer.parseInt(age);

			System.out.println("Passenger id = " + id);
			System.out.println("Passenger age = " + PassangerAge);
		} catch (NumberFormatException e) {
			System.out.println("Invalid passanger id or  age");
		}

		// calculate average baggage
		try {
			int totalBaggage = 500;

			double averageBaggage = (double) totalBaggage / numberOfPassenger;
			System.out.println("Average baggage = " + averageBaggage);
		} catch (ArithmeticException e) {
			System.out.println("Cannot calculate baggage average : Number of passanger is zero");
		}

		// search passanger using array

		try {
			int index = 5;

			System.out.println("Passanger " + Passenger[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid passanger index.");
		}

		// StringIndexOutOfBoundsException

		try {
			char seatLetter = seatNumber.charAt(10);
			System.out.println("Seat available = " + seatLetter);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("invalid seat number index");
		}

		// cast object value to expected type

		try {
			String name = (String) PassengerData[1];
			System.out.println("Passanger name = " + name);
		} catch (ClassCastException e) {
			System.out.println("invalid data type in passanger data");
		}

		// perform operations on passanger data that may be null
		try {
			String PassangerName = null;
			System.out.println("Name length " + PassangerName.length());

		} catch (NullPointerException e) {
			System.out.println("Passanger data is null");
		}
		// calculate continue here
		try {
			double totalAmount = 1000.00;
			int totalSeats = 6;
			double bookingAverage = totalAmount / totalSeats;

			System.out.println("Booking Average = " + bookingAverage);
		} catch (ArithmeticException e) {
			System.out.println("Cannot calculate booking average : Number of seats is zero");
		}
		System.out.println("\nProgram Continue successfully...");
		System.out.println("Passenger booking booking complete");
	}

}
