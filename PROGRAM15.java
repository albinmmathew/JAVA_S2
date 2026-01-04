/*PROGRAM 15 ISA & HASA RELATIOSHIP
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 08/12/2025
*/

import  java.util.*;

class Person{
	String name;
	Scanner sc = new Scanner(System.in);
	public void read(){
		System.out.print("Enter your name");
		name=sc.nextLine();
	}
	public void dispPerson(){
		System.out.println("Name: " + name);
	}	
}

class Teacher extends Person{
	String subject;
	public void input(){
		System.out.print("Enter your subject");
		subject = sc.nextLine();
	}
	public void dispTeacher(){

		System.out.println("Subject: " + subject);
	}
}

class Engine{
	public void start(){
		System.out.println("Engine is starting.....");
	}
}

class Car{
	Engine e;
	public Car(){
		e = new Engine();
	}
	public void move(){
		e.start();
		System.out.println("Car is moving....");
	}
}

class PROGRAM15 {
    public static void main(String args[]){
		Teacher t = new Teacher();
		Car c = new Car();

		System.out.println("ISA");
		t.read();
		t.input();
		t.dispPerson();
		t.dispTeacher();

		System.out.println("HASA");
		c.move();
	}
}