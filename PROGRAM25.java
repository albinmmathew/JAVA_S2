/*PROGRAM 25 THREADS USING THREAD CLASS
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 17/12/2025
*/

class Th extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

public class PROGRAM25{
    public static void main(String args[]){
        Th t1 = new Th();
        Th t2 = new Th();
        t1.start();
        t2.start();
    }
}
