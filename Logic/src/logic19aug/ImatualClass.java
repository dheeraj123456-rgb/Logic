package logic19aug;

public class ImatualClass {

	public static void main(String[] args) {
		
		College college = new College("IIT rorkee","Gujrat");
		
		
	   Student s1 = new Student("Rohit",24,college);
	    System.out.println(s1.getCollege().name);
	    
	    s1.getCollege().name= "magadh university";
	    System.out.println(s1.getCollege().name);
	


	
	}
}

final class Student {
	private final String name;
	private final int age;
	private final College college;
	
	Student(String name,int age,College college){
		this.name=name;
		this.age=age;	
		this.college=college;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public College getCollege() {
		return this.college;
	}
}


final class College {
	 String name;
	 String address;
	
	College(String name,String address){
		this.name=name;
		this.address=address;
	}
}