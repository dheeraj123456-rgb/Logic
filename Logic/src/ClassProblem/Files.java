package ClassProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
	public static void main(String[] args) {
		System.out.println("Main methoda started");
		File fileA = new File("A.txt");
		File fileB = new File("B.txt");
		
		try {
			//Create file
		fileA.createNewFile();
		fileB.createNewFile();
	
		//Write content to A.txt file
		FileWriter fwA = new FileWriter(fileA);
		BufferedWriter bwA = new BufferedWriter(fwA);
		
		   bwA.write("Hello, this is File A.");
           bwA.newLine();
           bwA.write("Java File Handling");

           bwA.close();
		
           //write content to b.text file
           FileWriter fwB = new FileWriter(fileB);
           BufferedWriter bwB = new BufferedWriter(fwB);
	
		bwB.write("Hello,this is File B.");
		bwB.newLine();
		bwB.write("Java file Handling");
		
		bwB.close();
		
		//Read a.txt
		FileReader frA = new FileReader(fileA);
		BufferedReader brA = new BufferedReader(frA);
		
		System.out.println("Content of A.txt");
		String line;
		
		while((line = brA.readLine()) != null) {
			System.out.println(line);
		}
		brA.close();
		
		//Read B.txt file
		
		FileReader frB = new FileReader(fileB);
		BufferedReader brB = new BufferedReader(frB);
		
		System.out.println("Content of B.txt");
		
		
		while((line = brB.readLine()) != null) {
			System.out.println(line);
		}
		brB.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
