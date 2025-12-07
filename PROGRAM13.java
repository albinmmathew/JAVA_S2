/*PROGRAM 13 STRING CONCATENATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 06/12/2025
*/

import java.io.*;
import java.util.*;

class CString{
    String s;
    Scanner sc = new Scanner(System.in);
	//Function to read the string
    public void read(){
        System.out.print("Enter a String: ");
        s= sc.nextLine();
    }
	//Funtion to display the string
    public void display(){
        System.out.println(s);      
    }
	//Function to compare 2 string and return a boolean value
    public boolean compare(CString c){
        if(s.equals(c.s))
            return true;
        else
            return false;
    }
	//Function to concatenate
    public void add(CString c){
        System.out.println("Concatenated String is " + s + c.s);
    } 
}

class PROGRAM13 {
    public static void main(String args[]) {
        CString c1 = new CString();
        CString c2 = new CString();
        c1.read();
        c1.display();
        c2.read();
        c2.display();
        System.out.println("Are the given Strings same? " + c1.compare(c2));
        c1.add(c2);
    }
}
