/*PROGRAM 2 PERFORMING MATHEMATICAL OPERATIONS USING SWITCH CASE
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 17/11/2025
*/

import java.io.*;

class PROGRAM02 {
	public static void main(String args[]) {
		//Checking number of arguments
		if (args.length < 3) {
			System.out.println("Usage: java PROGRAM_02 <num1> <num2> <option>");
			return;
		}
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		int opp;
		switch (n3) {
			case 1:	//Addition
				opp = n1 + n2;
				System.out.println("Result: " + opp);
				break;
				
			case 2:	//Subtraction
				opp = n1 - n2;
				System.out.println("Result: " + opp);
				break;
			
			case 3:	//Multiplication
				opp = n1 * n2;
				System.out.println("Result: " + opp);
				break;
				
			case 4:	//Division
				if (n2 == 0) {
					System.out.println("Error: Division by zero!");
				} else {
					opp = n1 / n2;
					System.out.println("Result: " + opp);
				}
				break;
				
			default:
				System.out.println("INVALID OPTION");
				break;
		}
	}
}
