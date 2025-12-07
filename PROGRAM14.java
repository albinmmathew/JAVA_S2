/*PROGRAM 14 CREATING A STUDENT CLASS AND COMPARISON FUNCTION
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 30/11/2025
*/

import java.io.*;
import java.util.*;

class Student {
	int sno;
	String sname;
	String sprogram;
	// Function to read a Student Details
	public void read() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Sno: ");
		sno = s.nextInt();
		s.nextLine();
		System.out.print("Enter Name: ");
		sname = s.nextLine();
		System.out.print("Enter Program: ");
		sprogram = s.nextLine();
	}
	// Function to display Student Details
	public void display() {
		System.out.println("Sno: " + sno);
		System.out.println("Name: " + sname);
		System.out.println("Program: " + sprogram);
	}
	// Function to compare two Student Details
	public void compare(Student t) {
		if (sno == t.sno && sname.equals(t.sname) && sprogram.equals(t.sprogram))
			System.out.println("\nBoth students are same.");
		else
			System.out.println("\nBoth students are not same.");
	}
}

class PROGRAM14 {
	public static void main(String args[]) {
		Student s = new Student();
		Student t = new Student();
		System.out.println("Enter details for Student 1:");
		s.read();
		System.out.println("\nDetails of Student 1:");
		s.display();
		System.out.println("\nEnter details for Student 2:");
		t.read();
		System.out.println("\nDetails of Student 2:");
		t.display();
		s.compare(t);
	}
}
