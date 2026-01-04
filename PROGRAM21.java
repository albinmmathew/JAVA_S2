/*PROGRAM 21 MULTIPLE CATCH STATEMENTS
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 11/12/2025
*/
import java.io.*;
class PROGRAM21 {
    public static void main(String args[]) {
        int a,b,c;
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("Enter two numbers: ");
            String s = din.readLine();
            a = Integer.parseInt(s);
            s = din.readLine();
            b = Integer.parseInt(s);
            c = a/b;
            System.out.println(c);
        }
        catch(IOException e1) {
            System.out.println("IO: " + e1);
        }
        catch(NumberFormatException e2){
            System.out.println("NFE: " + e2);
        }
        catch(ArithmeticException e3){
            System.out.println("DBZ: " + e3);
        }
        catch(Exception e4){
            System.out.println("UKE: " + e4);
        }
    }
}
