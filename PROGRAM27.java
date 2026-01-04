/*PROGRAM 27 THREADS - ODD OR EVEN
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 18/12/2025
*/

import java.util.Scanner;
class Odd extends Thread{
    int n;
    public Odd(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println("Odd: "+i);
            }
        }
    }
}

class Even extends Thread{
    int n;
    public Even(int n){
        this.n = n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
        }
    }
}

public class PROGRAM27 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your limit: ");
        n=sc.nextInt();

        Odd O = new Odd(n);
        Even E = new Even(n);
        
        O.start();
        E.start();
        
    }    
}
