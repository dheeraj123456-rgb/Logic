package logic23aug;

import java.util.Objects;

public class Object {

	public static void main(String[] args) throws CloneNotSupportedException {
		Students s1 = new Students();
		s1.name="Dheeraj sharma";
		s1.age=24;
		
		System.out.println(s1.toString());
		
		Students s2 = new Students();
		s2.name= "Dheeraj sharma";
		s2.age = 24;
		
	//	System.out.println(s1.equals(s2));
		
	//	System.out.println(s1.hashCode() == s2.hashCode());
		
	//	System.out.println(s1.getClass().getName());
		
	//	System.out.println(s1 instanceof Object);
		
		Students s3 = (Students)s1.clone();
		
	}

}

class Students extends Object implements Cloneable{
	String name;
	int age;
	
	@Override
	public String toString() {
		return(name + " " + age);
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {
		
		if(obj.getClass() != this.getClass()) {
			return false;
		}
		
		Students s = (Students) obj;
		return this.name == s.name && this.age == s.age;
	}
	
	public int hascode() {
		return Objects.hash(name,age);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return (Object) super.clone();
	}
}


