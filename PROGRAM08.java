/*PROGRAM 8 REVERSE AND PALINDROME
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 29/11/2025
*/

import java.io.*;
import java.util.*;

class Palindrome{
	//Function to reverse a number
	public int rev(int n){
		int rev = 0;
		int temp = n;
		while(temp != 0){
			rev = rev * 10 + (temp % 10);
			temp = temp / 10;
		}
		return rev;
	}
	//Function to check whether a number is Palindrome
	public boolean check(int n){
		if(n == rev(n))
			return true;
		else
			return false;
	}
}

class PROGRAM_08 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Palindrome p = new Palindrome();
		System.out.println("Enter a number: ");
		int a = s.nextInt();
		int r = p.rev(a);
		System.out.println("Reverse : " + r);
		if(p.check(a))
			System.out.println("It is a Palindrome.");
		else
			System.out.println("It is not a Palindrome");

	}
}