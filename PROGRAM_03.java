/*PROGRAM 3 PREDICTION OF SECRET NUMBER
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 27/11/2025
*/

import java.io.*;
import java.util.*;

class PROGRAM_03 {
	public static void main(String args[]) {
		int key = 24, count = 0, guess;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("Predict a Number between 20 and 30 :");
			guess = s.nextInt();
			count++;
		} while(guess != key);
		System.out.println("Congrats!!");
		System.out.println("You have predicted the secret number in " + count + " attempts.");
	}
}
