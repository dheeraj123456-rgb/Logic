package ClassProblem;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void DisplayPersonDetails(){
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
}

class Students extends Person{
	
	
	String CollegeName;
	
	Students (String name , int age,String CollegeName){
		super(name,age);
		this.CollegeName = CollegeName;
	}
	
	void DisplayStudentDetails() {
		DisplayPersonDetails();
		System.out.println("College name : " + CollegeName);
		
	}
}





public class Nameheritance {
	
        public static void main(String []args) {
        	
        	Students student = new Students(
        	"Dheeraj",
        	22,
        	"Xyz college"
        	);
        	
        	
        	student.DisplayStudentDetails();
        }
}
