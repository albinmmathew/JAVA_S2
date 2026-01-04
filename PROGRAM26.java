/*PROGRAM 26 THREADS USING RUNNABLE INTERFACE
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 17/12/2025
*/

class Th2 implements Runnable{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println(i);
        }
    }
}
public class PROGRAM26 {
    public static void main(String[] args) {
        Th2 obj1 = new Th2();
        Th2 obj2 = new Th2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
