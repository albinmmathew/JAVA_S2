/*PROGRAM 29 SQUARE AND CUBE USING THREADS
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 20/12/2025
*/

import java.util.*;

class Power extends Thread{
    int n;
    String type;
    public Power(int n , String type){
        this.n = n;
        this.type = type;
    }
    public void run(){
        if(type.equals("sq")){
            int c = n * n;
            System.out.println("Square of " + n + " : " + c);
        }else if(type.equals("cube")){
            int d = n * n * n;
            System.out.println("Cube of " + n + " : " + d);
        }
    }
}

public class PROGRAM29 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        n = sc.nextInt();

        Power p1 = new Power(n, "sq");
        Power p2 = new Power(n, "cube");

        p1.start();
        p2.start();
    }    
}


