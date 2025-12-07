/*PROGRAM 05 ARRAY PASSING
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 27/11/2025
*/

import java.io.*;
import java.util.*;

class ArrayPassing {
	//Function to read and return an array
	public int[] read(){
		Scanner s;
		s= new Scanner(System.in);
		int n,i,a[];
		System.out.print("Enter the number of elements:");
		n = s.nextInt(); 
		a = new int[n];
		System.out.println("Enter the elements:");
		for(i = 0;i < n;i++){
			a[i] = s.nextInt();
		}
		return a;
	}
	//Function to display a given array
	public void disp(int a[]) {
		int i;
		for(i = 0;i<a.length;i++){
			System.out.print(a[i] + "\t");
        } 
        System.out.println();
	}
}

class PROGRAM05 {
	public static void main(String args[]) {
		ArrayPassing obj;
		obj = new ArrayPassing();
		int a[] = obj.read();
		obj.disp(a);
	}
}