/*PROGRAM 38 MENU DRIVEN STRING OPERATIONS
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 05/01/2026
*/

import java.io.*;
import java.util.*;

public class PROGRAM38 {
    public static void main(String args[]) {
		int ch;
		Scanner sc = new Scanner(System.in);		
		while(true){
			System.out.println("1 - Length of a given string");
			System.out.println("2 - Compare for equality"); 
			System.out.println("3 - Extract a substring from a string"); 
			System.out.println("4 - Convert to uppercase and lowercase"); 
			System.out.println("5 - Reverse a string"); 
			System.out.println("6 - Exit"); 
			System.out.print("Enter your choice: ");
			String str;
			ch = sc.nextInt();
			sc.nextLine(); //consumes extra line
			switch (ch) {
				case 1:
					System.out.print("Enter the String: ");
					str = sc.nextLine();
					System.out.println("Length of " + str + " is " + str.length());
					break;
				case 2:
					System.out.print("Enter the first Sting for comparison: ");
					str = sc. nextLine();
					System.out.print("Enter the second String for comparison: ");
					String  str2 = sc.nextLine();
					if(str.equals(str2)){
						System.out.println("Both Strings are same.");
					}
					else{

						System.out.println("Both strings are not same.");
					}
					break;
				case 3:
					System.out.print("Enter Main String: ");
					str = sc.nextLine();
					System.out.print("Enter the starting index of substring: ");
					int start = sc.nextInt();
					System.out.print("Enter the ending index of substring: ");
					int end = sc.nextInt();
					System.out.println("Substring : " + str.substring(start,end));
					break;
				case 4:
					System.out.print("Enter the String: ");
					str = sc.nextLine();;
					System.out.println("Upper Case: " + str.toUpperCase());
					System.out.println("Lower Case: " + str.toLowerCase());
					break;
				case 5:
					System.out.print("Enter the String to Reverse: ");
					str = sc.nextLine();
					String reverse = "";
					for(int i = str.length()-1; i >= 0; i--){
						reverse += str.charAt(i);
					}
					System.out.println("Reversed String: " + reverse);
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("Invalid Option!!");
					break;
			}
		}
    }
}
