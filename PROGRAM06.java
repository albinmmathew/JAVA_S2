/*PROGRAM 6 ADDITION AND MULTIPLICATION OF MATRICES
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 27/11/2025
*/

import java.io.*;
import java.util.*;
class MOpp{
	Scanner s = new Scanner(System.in);
	//Function to read and return a matrix 
	public int[][] read(){
		System.out.println("Enter the number of rows and columns : ");
		int r = s.nextInt();
		int c = s.nextInt();
		int mat[][] = new int[r][c];
		System.out.println("Enter the elements :");
		for (int i = 0; i < r; i++){
			for (int j = 0; j < c; j++){
				mat[i][j] = s.nextInt();
			}
		}
		return mat;
	}
	//Function to display a matrix
	public void display(int mat[][]){
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat[0].length; j++){
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//Function to add two matrices if dimensions allign
	public void sum(int a[][],int b[][]){
		if(a.length == b.length && a[0].length == b[0].length){
			int sum[][] =  new int[a.length][a[0].length];
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < a[0].length; j++){
					sum[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println("Sum:");
			display(sum);
		}
		else{
			System.out.println("The given matrices have different Dimension.");
		}
	}
	//Function to multiply two matrices if dimensions align
	public void multiply(int a[][], int b[][]){
		if(a[0].length == b.length){
			int mult[][] = new int[a.length][b[0].length];
			for (int i = 0; i < a.length; i++){
				for (int j = 0; j < b[0].length; j++){
					mult[i][j] =0;
					for(int k = 0; k < a[0].length; k++){
						mult[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			System.out.println("Product:");
			display(mult);
		}
		else{
			System.out.println("The given matrices can't be multiplied due to difference in the dimensions of the matrix");
		}
	}
	//Function for Menu
	public void menu(){
		int a[][], b[][];
		while (true) {
			System.out.println("1 - Addition");
			System.out.println("2 - Multiplication");
			System.out.println("3 - Exit");
			System.out.println("Enter Your choice: ");
			int choice = s.nextInt();
			switch(choice) {
				case 1:
					System.out.println("ADDITION");
					System.out.println("Enter the first matrix:");
					a = read();
					System.out.println("Enter the Second matrix:");
					b = read();
					System.out.println("First matrix:");
					display(a);
					System.out.println("Second matrix:");
					display(b);
					sum(a,b);
					break;
				case 2:
					System.out.println("MULTIPLICATION:");
					System.out.println("Enter the first matrix:");
					a = read();
					System.out.println("Enter the Second matrix:");
					b = read();
					System.out.println("First matrix:");
					display(a);
					System.out.println("Second matrix:");
					display(b);
					multiply(a,b);
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}
	}

}

class PROGRAM06 {
	public static void main(String args[]){	
		MOpp obj  = new MOpp();
		obj.menu();
	}
}