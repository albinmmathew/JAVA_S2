/*PROGRAM 14 
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 29/11/2025
*/

import java.io.*;
import java.util.*;

class Student {
	int sno;
	String sname;
	String sprogram;
	//Function to read a Student Details
	public void read(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Sno: ");
		sno = s.nextInt();
		s.nextLine();
		System.out.println("Enter Name: ");
		sname = s.nextLine();
		System.out.println("Enter Program: ");
		sprogram = s.nextLine();
	}
	//Function to display Student Details
	public void display(){
		System.out.println("Sno: " + sno);
		System.out.println("Name: " + sname);
		System.out.println("Program: " + sprogram);
	}
	//Function to compare two Student Details
	public void compare(Student t){
		if(sno == t.sno && sname.equals(t.sname) && sprogram.equals(t.sprogram))
			System.out.println("They are same.");
		else
			System.out.println("They are not same.");
	}
}

class PROGRAM_14 {
	public static void main(String args[]){
		Student s = new Student();
		Student t = new Student();
		s.read();
		s.display();
		t.read();
		t.display();
		s.compare(t);
	}
}

