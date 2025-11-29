/*PROGRAM 4 SEARCHING AND SORTING IN ARRAY
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 20/11/2025
*/

import java.io.*;
import java.util.*;
class array{
	//Function to read and return an array
	public int[] read(){
		int arr[];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :");
		int n = s.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter the element at [" + i + "] :");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	//Function for displaying array
	public void disp(int arr[]){
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	//Function to Search for an element in an array:
	public void search(int arr[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements to search:");
		int key = s.nextInt();
		Boolean isFound = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key) {
				System.out.println("Element found at [" + i + "] ");
				isFound = true;
			}
		}
		if (!isFound)
			System.out.println("Element not found.");
	}

	//Function to sort an array
	public void sort(int arr[]){
		int temp;
		for(int i = 0; i < arr.length; i++){
			for (int j = i; j < arr.length ; j++){
				if (arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array : ");
		disp(arr);
	}
}

class PROGRAM_04 {
	public static void main(String args[]){
		array obj = new array();
		int a[] = obj.read();
		obj.disp(a);
		obj.search(a);
		obj.sort(a);
	}
}