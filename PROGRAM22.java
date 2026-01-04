/*PROGRAM 22 USER DEFINED EXCEPTIONS
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 15/12/2025
*/

import  java.util.*;

class UDE extends Exception{
	public UDE(String msg){
		super(msg);
	}
}

class Authen {
	int age;
	public void validate(){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter your age:");
			age = sc.nextInt();
		
			if(age >= 18){
				System.out.println("You are eligible.");
			}else{
				throw new UDE("You are not eligible");
			}
		}catch(UDE e){

			System.out.println("Error : " + e.getMessage());
		}
	}
}

class PROGRAM22 {
	public static void main(String args[]){
		Authen obj = new Authen();
		obj.validate();
		
	}
}
