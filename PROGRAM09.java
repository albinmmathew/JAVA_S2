/*PROGRAM 09 NUMBER SLIDING GAME
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 29/11/2025
*/

import java.io.*;
import java.util.*;

class SLIDER {
	public static final int SIZE = 4;	//Declaring a fixed variable for board size
	int Board[][] = new int[SIZE][SIZE];	
	Scanner s  = new Scanner(System.in);
	int ec = 3, er = 3;	//Current Empty Space
	int er1 = 3, ec1 = 3;
	//Function to initialize the board (Fixed)
	public void initBoard(){
		Board[0] = new int[]{1, 2, 3, 4};
		Board[1] = new int[]{5, 6, 12, 7};
		Board[2] = new int[]{9, 10, 11, 8};
		Board[3] = new int[]{13, 14, 15, 0};
	}
	//Function to print the board
	public void printboard(){
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				if (Board[i][j] == 0)	
					System.out.print(" \t");	//Incase of 0 -> prints blank
				else
					System.out.print(Board[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//Function to swap 2 values
	public void swap(int er , int ec, int er1, int ec1){
		int temp = Board[er][ec];
		Board[er][ec] = Board[er1][ec1];
		Board[er1][ec1] = temp;
	}
	//Function to check if swappinng is possible
	public boolean checkswap(int a) {
		if (er + 1 < SIZE && Board[er + 1][ec] == a) {	// Check DOWN
			er1 = er + 1;
			ec1 = ec;
			return true;
		}
		if (er - 1 >= 0 && Board[er - 1][ec] == a) {	// Check UP
			er1 = er - 1;
			ec1 = ec;
			return true;
		}
		if (ec + 1 < SIZE && Board[er][ec + 1] == a) {	// Check RIGHT
			er1 = er;
			ec1 = ec + 1;
			return true;
		}
		if (ec - 1 >= 0 && Board[er][ec - 1] == a) {	// Check LEFT
			er1 = er;
			ec1 = ec - 1;
			return true;
		}
		return false;
	}
	//Function to check whether the game is finished
	public boolean checkwin(){
		int count = 1;
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				// Check if each tile is in the correct position
				if (i == SIZE - 1 && j == SIZE - 1) {
					if (Board[i][j] != 0) {	//Checking if last tile is not zero
						return false;
					}
				} else {
					if (Board[i][j] != count) {
						return false;
					}
					count++;
				}
			}
		}
		return true;
	}
	public void option(){
		int option;
		initBoard();
		while (true) {	//Loops till either the game is over or won
			printboard();
			if(checkwin()){
				System.out.println("Congrats on solving!!");
				System.exit(0);
			}
			System.out.println("Enter the number to slide the space. Enter -1 to exit");
			System.out.print("Enter number to swap: ");
			option = s.nextInt();
			if(option == -1)	//To exit prematurely
				System.exit(0);
			else{
				if(checkswap(option)){
					swap(er,ec,er1,ec1);
					er = er1;
					ec = ec1;
				}
				else {
					System.out.println("Unable to swap!!");
				}
			}

		}
	}
}

class PROGRAM09 {
	public static void main(String args[]){
		SLIDER sli = new SLIDER();
		sli.option();
	}
}