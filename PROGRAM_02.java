/*PROGRAM 2 PERFORMING MATHEMATICAL OPERATIONS USING SWITCH CASE
@ALBIN MAMMEN MATHEW
Roll No: 08 
17/11/2025
*/

import java.io.*;
class SWTCH {
    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Usage: java CLA1 <num1> <num2> <option>");
            return;
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int opp;
        switch (n3) {
            case 1:
                opp = n1 + n2;
                System.out.println("Result: " + opp);
                break;

            case 2:
                opp = n1 - n2;
                System.out.println("Result: " + opp);
                break;

            case 3:
                opp = n1 * n2;
                System.out.println("Result: " + opp);
                break;

            case 4:
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
