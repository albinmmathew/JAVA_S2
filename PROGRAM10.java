/*PROGRAM 10 DISPLAYING FIRST N NUMBERS USING RECURSION
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 29/11/2025
*/

import java.io.*;
import java.util.*;

class Recursive {
	// Function to display in ascending order (1 - n)
	public void AscRec(int n) {
		if (n > 0) {
			AscRec(n - 1);
			System.out.print(n + "\t");
		}
	}
	// Function to display in descending order (n - 1)
	public void DescRec(int n) {
		if (n > 0) {
			System.out.print(n + "\t");
			DescRec(n - 1);
		}
	}
}

class PROGRAM10 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int n = s.nextInt();
		Recursive r = new Recursive();
		System.out.println("Ascending order: ");
		r.AscRec(n);
		System.out.println();
		System.out.println("Descending order: ");
		r.DescRec(n);
		System.out.println();
	}
}