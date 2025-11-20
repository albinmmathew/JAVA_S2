/*PROGRAM 1 ADDING 2 NUMBERS RECIEVED AS COMMAND-LINE ARGUMENTS
@ALBIN MAMMEN MATHEW
Roll No: 08 
17/11/2025
*/

import java.io.*;
class PROGRAM_01 {
    public static void main(String args[]) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int sum = n1 + n2;
        System.out.println("First No = " + n1);
        System.out.println("Second No = " + n2);
        System.out.println("Sum = " + sum);
    }
}
