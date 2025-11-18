/*PROGRAM 1 DISPLAYING 2 NUMBERS RECIEVED AS COMMAND-LINE ARGUMENTS
@ALBIN MAMMEN MATHEW
Roll No: 08 
17/11/2025
*/

import java.io.*;
class CLA {
    public static void main(String args[]) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println("First No: " + n1);
        System.out.println("Second No: " + n2);
    }
}
