/*PROGRAM 16 OVERCOMING FUNCTION OVERRIDING
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 08/12/2025
*/

import java.util.*;

 class Book {
    String author, bname;
    Scanner s = new Scanner(System.in);
    public void read() {
        System.out.print("Enter book name: ");
        bname = s.nextLine(); 
		System.out.print("Enter author name: ");
        author = s.nextLine(); 
    }
    public void disp() {
    	System.out.println("Book name: " + bname);
		System.out.println("Author name: " + author);
    }
}

class Comic extends Book{
    String artist;
    Scanner s = new Scanner(System.in);
    public void read() {
    	super.read();
        System.out.print("Enter Artist name: ");
        artist = s.nextLine(); 
    }
    public void disp() {
    	super.disp();
		System.out.println("Artist name: " + artist);
    }
}

class PROGRAM16 {
	public static void main (String argd[]){
        Comic c = new Comic();
		c.read();
		System.out.println("Comic details: ");
		c.disp();
	}
}