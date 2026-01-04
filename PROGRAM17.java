/*PROGRAM 17 SUPER KEYWORD
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 09/12/2025
*/

import java.util.*;

class A {
    int a;
    Scanner s = new Scanner(System.in);
    public A(){
        a = 0;
    }
    public A(int no){
        a = no;
    }
    public void read() {
        System.out.print("Enter no: ");
        a = s.nextInt(); 
    }
    public void disp() {
        System.out.println("a = " + a);
    }
}

class B extends A{
    String b;
    Scanner s = new Scanner(System.in);
    public B(){
        b = " ";
    }
    public B(int  no, String s){
        super(no);
        b = s;
    }
    public void read() {
        super.read();
        System.out.print("Enter String: ");
        b = s.nextLine(); 
    }
    public void disp() {
        super.disp();
        System.out.println("b = " + b);
    }
}

class C extends B{
    float c;
    Scanner s = new Scanner(System.in);
    public C(){
        c = 0;
    }
    public C(int  no, String s, float f){
        super(no,s);
        c = f;
    }
    public void read() {
        super.read();
        System.out.print("Enter float: ");
        c = s.nextFloat(); 
    }
    public void disp() {
        super.disp();
        System.out.println("c = " + c);
    }
}

class PROGRAM17 {
    public static void main (String argd[]){
        C obj = new C();
        obj.disp();
        obj.read();
        obj.disp();
    }
}