package ClassProblem;

interface Hospital{
	void performDuty();    
}


 class displayDetails {
	int EmployeeId;
	String EmployeeName;
	double Salary;
	
	displayDetails(int EmployeeId,String EmployeeName,double Salary){
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.Salary = Salary;
	}
	
	void EmployeeDetails() {
		System.out.println("Employee id = " + EmployeeId);
		System.out.println("Employee Name = " + EmployeeName);
		System.out.println("Employee salary = " + Salary);
	}
}
 
 class Doctor extends displayDetails implements Hospital {
	 
	 double allowance = Salary * 30 / 100;
	 double finalSalary = Salary + allowance;
	 
	 Doctor(int EmployeeId,String EmployeeName,double Salary){
		 super(EmployeeId,EmployeeName,Salary);
		 
	 } 
		 @Override
		 public void performDuty() {
			   EmployeeDetails();
			 System.out.println("Doctor salary = " + finalSalary);
		        System.out.println("**************************************");
		
	 }
 }
 
 class Nurse extends displayDetails implements Hospital{
	 
	 double allowance = Salary * 20 /100;
	 double finalSalary = Salary + allowance;
	 
	 Nurse( int EmployeeId,String EmployeeName,double Salary){
		 super(EmployeeId,EmployeeName,Salary);
	 }
	 
	 @Override
	 public void performDuty() {
	        EmployeeDetails();
	        System.out.println("Final Salary = " + finalSalary);
	        System.out.println("**************************************");
	
	 }
 }
 
 class Receptionist extends displayDetails implements Hospital{
	 double allowance = Salary * 10 /100;
	 double finalSalary = Salary + allowance;
	 
	 Receptionist (int EmployeeId,String EmployeeName,double Salary){
		 super(EmployeeId,EmployeeName,Salary);
	 }
	 @Override
	 public void performDuty() {
		 EmployeeDetails();
		 System.out.println("Receptioninst final salary = " + finalSalary);
	 }
 }


public class Demo4 {
	public static void main(String[] args) {
		Hospital hospital;
		hospital = new Doctor(101,"Dheeraj sharma",520000.00);
		hospital.performDuty();
		
		hospital = new Nurse(100,"Susmita sinha",30000.0);
		hospital.performDuty();
		
		hospital = new Receptionist(1001,"Suraj kumar",25000.00);
		hospital.performDuty();
	}

}
