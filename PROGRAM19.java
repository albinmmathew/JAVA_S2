/*PROGRAM 19 RUNTIME POLYMORPHISM (SHAPES)
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 10/12/2025
*/

import java.util.*;

interface  Calculate{
	public void result();
}

class Add implements Calculate{
	int  a, b;
	public Add(int  a, int b){
		this.a = a;
		this.b = b;
	}
	public void result(){
		System.out.println("Sum is "+ (a+b));
	}
}

class Sub implements Calculate{
	int  a, b;
	public Sub(int  a, int b){
		this.a = a;
		this.b = b;
	}
	public void result(){
		System.out.println("Difference  is "+ (a-b));
	}
}

class PROGRAM19 {
    public static void main(String args[]) {
        Calculate obj;
		obj = new Add(10,8);
		obj.result();
		obj = new Sub(10,6);
		obj.result();

    }
}