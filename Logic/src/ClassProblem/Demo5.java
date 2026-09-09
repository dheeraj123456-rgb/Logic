package ClassProblem;

import java.util.Scanner;

class Student{
	
	int marks;
	
	Student(int marks){
		this.marks=marks;
	}
	void calculateGrade() {
		System.out.println("Student Grade ");
	}
}

class EngineeringStudents extends Student{
	EngineeringStudents(int marks){
		super(marks);
	}
	
	@Override
	void calculateGrade() {
		System.out.println("Engineering student ");
		
		if (marks >= 90) {
			System.out.println("Grade = A ");
		}else if ( marks >= 80) {
			System.out.println("Grade = B");
		}else if(marks >= 70) {
			System.out.println("Grade = C");
		}else if ( marks >= 60) {
			System.out.println("Grade = D");
		}else {
			System.out.println("Grade = F");
		}
	}
}

class MedicalStudent extends Student{
	
	MedicalStudent(int marks){
		super(marks);
	}
	@Override
	void calculateGrade() {
		System.out.println("Medical students");
		
		if (marks >= 90) {
			System.out.println("Grade = A ");
		}else if ( marks >= 80) {
			System.out.println("Grade = B");
		}else if(marks >= 70) {
			System.out.println("Grade = C");
		}else if ( marks >= 60) {
			System.out.println("Grade = D");
		}else {
			System.out.println("Grade = F");
		}
	}
}

class ManagementStudent extends Student{
	ManagementStudent(int marks){
		super(marks);
	}

	@Override
	void calculateGrade() {
		System.out.println("Management student");
		
		if (marks >= 90) {
			System.out.println("Grade = A ");
		}else if ( marks >= 80) {
			System.out.println("Grade = B");
		}else if(marks >= 70) {
			System.out.println("Grade = C");
		}else if ( marks >= 60) {
			System.out.println("Grade = D");
		}else {
			System.out.println("Grade = F");
		
	   }
	}
}



public class Demo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Engineering students grade");
		int engineeringMarks = sc.nextInt();
		
		System.out.println("Medical student grade ");
		int medicalGrade = sc.nextInt();
		
		System.out.println("management student grade ");
		int managemntGrade = sc.nextInt();
		
		Student students;
		
		students = new EngineeringStudents(engineeringMarks);
		students.calculateGrade();
		
		students = new MedicalStudent(medicalGrade);
		students.calculateGrade();
		
		students = new ManagementStudent(managemntGrade);
		students.calculateGrade();
		
		sc.close();
	}

}
