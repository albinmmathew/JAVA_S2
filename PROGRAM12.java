/*PROGRAM 12 COMPLEX ARTHITHEMATIC
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 06/12/2025
*/

import java.io.*;
import java.util.*;

class Complexno{
    int real, imaginary;	//Variables for coefficients
    Scanner s = new Scanner(System.in);
	//Constructor for default allocation
    public Complexno(){ 
        real = 0;
        imaginary = 0;
    }
	//Function to read the complex number
    public void read(){
        System.out.println("Enter the real and imaginary coefficient");
        real = s.nextInt();
        imaginary = s.nextInt();
    }
	//Function to display the complex number
    public void disp(){
        System.out.println("Expression : " + real + " + " + imaginary +"i ");
    }
	//Function to add 2 complex number and return the sum
    public Complexno add(Complexno c){
        Complexno sum = new Complexno();
        sum.real = real + c.real;
        sum.imaginary = imaginary + c.imaginary;
        return sum;
    } 
	//Function to multiply 2 complex number and return the product
    public Complexno multiply(Complexno c){
        Complexno product = new Complexno();
        product.real = (real * c.real) - (imaginary * c.imaginary);
        product.imaginary = (real * c.imaginary) + (imaginary * c.real);
        return product;
    }
}

class PROGRAM12 {
    public static void main(String args[]){
		Scanner s  = new Scanner(System.in);
		int choice;
		Complexno c1 = new Complexno();
        Complexno c2 = new Complexno();
        Complexno result = new Complexno();
		while (true) {
            System.out.println("1 - Read Numbers.");
			System.out.println("2 - Addition.");
			System.out.println("3 - Multiplication.");
			System.out.println("4 - Exit.");
   			System.out.print("Enter Your Choice : ");
			choice = s.nextInt();
			switch(choice) {
				case 1:
					c1.read();
                    c2.read();
                    c1.disp();
                    c2.disp();
					break;
				case 2:
					result = c1.add(c2);
                    result.disp();
					break;
				case 3:
					result = c1.multiply(c2);
                    result.disp();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid Choice!!");
					break;
			}
		}
	}
}
