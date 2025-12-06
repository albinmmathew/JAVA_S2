/*PROGRAM 13 COMPLEX ARTHITHEMATIC
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 06/12/2025
*/

import java.io.*;
import java.util.*;

class CString{
    String s;
    Scanner sc = new Scanner(System.in);
    public void read(){
        System.out.println("Enter a String: ");
        s= sc.nextLine();
    }
    public void display(){
        System.out.println(s);        
    }
    public Boolean compare(CString c){
        if(s.equals(c))
            return true;
        else
            return false;
    }
    public void add(CString c){
        System.out.println(s + c.s);
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
        System.out.println(c1.compare(c2));
        c1.add(c2);
    }
}
