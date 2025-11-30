/*PROGRAM 7 MAX OF THREE NUMBERS USING FUNCTION
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 29/11/2025
*/

import java.io.*;
import java.util.*;
class Max{
	//Function to find max of two numbers
	public int max(int a, int b){
		return a > b ? a : b;
	}
}
class PROGRAM_07{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Max m = new Max();
		System.out.println("Enter three numbers:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int greatest = m.max(m.max(a,b),c);
		System.out.println("Maximum of the given Numbers is " + greatest);
	}
}