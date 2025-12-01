/*PROGRAM 11 ARITHEMATIC OPERATIONS USING OOP CONCEPTS
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 29/11/2025
*/

import java.io.*;
import java.util.*;

class CalculatorOOP {
	int a, b;
	//Function to Read the two numbers
	public void read() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a : ");
		a = s.nextInt();
		System.out.println("Enter b : ");
		b = s.nextInt();
	}
	//Function to add and display the sum
	public void add(){
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}
	//Function to subtract and display the difference 
	public void subtract(){
		int diff = a - b;
		System.out.println("Difference = " + diff);
	}
	//Function to multiply and display the product 
	public void multiply() {
		int prod = a * b;
		System.out.println("Product = " + prod);
	}
	//Function to divide and display the quotient 
	public void divide() {
		int quo = a / b;
		System.out.println("Quotient = " + quo);
	}
}

class PROGRAM11 {
	public static void main(String args[]){
		Scanner s  = new Scanner(System.in);
		int choice;
		CalculatorOOP calc = new CalculatorOOP();
		while (true) {
			System.out.println("1 - Addition.");
			System.out.println("2 - Subtraction.");
			System.out.println("3 - Multiplication.");
			System.out.println("4 - Division.");
			System.out.println("5 - Exit.");
			choice = s.nextInt();
			switch(choice) {
				case 1:
					calc.read();
					calc.add();
					break;
				case 2:
					calc.read();
					calc.subtract();
					break;
				case 3:
					calc.read();
					calc.multiply();
					break;
				case 4:
					calc.read();
					calc.divide();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Invalid Choice!!");
					break;
			}
		}
	}
}

