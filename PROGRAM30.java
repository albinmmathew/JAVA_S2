/*PROGRAM 30 PRINTER QUEUE WITHOUT SYNCHRONISATION
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 20/12/2025
*/

class Printer{
    public void printFile(String user, String filename){
        System.out.println(user + " started printing " + filename);
        for(int i=1;i<=5;i++){
            System.out.println(user + " printing "  + filename + " page no " + i);        
        }
        System.out.println(user + " finished printing: " + filename);
    }
}

class User extends Thread{
    Printer p;
    String user,filename;
    public User(Printer p, String user, String filename){
        this.p = p;
        this.user = user;
        this.filename = filename;
    }
    public void run(){
        p.printFile(user, filename);
    }
}

public class PROGRAM30 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        User u1 = new User(obj, "User 1", "PDF");
        User u2 = new User(obj, "User 2", "DOCX");
        User u3 = new User(obj, "User 3", "SHEET");
        u1.start();
        u2.start();
        u3.start();
    }    
}


