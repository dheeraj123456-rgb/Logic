package ClassProblem;

interface Attendance{
	void markAttendance();
}

class Developer implements Attendance{
	
	@Override
	public void markAttendance() {
		System.out.println("Developer : Developer attendance marked Successfully ");
	}
}

class Tester implements Attendance{
	
	@Override
	public void markAttendance(){
		System.out.println("Tester : Tester attendance marked Successfully ");
	}
}

class Manager implements Attendance {
	
	@Override
	public void markAttendance() {
		System.out.println("Manager : Manager attendance marked Successfully");
	}
}


public class Demo6 {
	public static void main(String[] args) {
		Attendance a1 = new Developer();
		Attendance a2 = new Tester();
		Attendance a3 = new Manager();
		
		a1.markAttendance();
		a2.markAttendance();
		a3.markAttendance();
	}

}
