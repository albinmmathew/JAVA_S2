/*PROGRAM 33 BANK DEPOSIT AND WITHDRAWAL WITHOUT SYNCHRONIZATION 
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 22/12/2025
*/

class Account{
    int CB = 0, total = 0;
    public void deposit(int amount){
        total += amount;
        CB = total;
        boolean credit = true;
        if(credit){
            System.out.println("The total savings in your account is: " + total);
        }
    }
    public void withdraw(int amount){
        if(amount > CB){
            System.out.println("Insufficient balance your account have");
        }else{
            CB -= amount;
            total = CB;
            System.out.println("Your balance is: " + total);
        }
    }
}

class Deposit extends Thread{
    Account ac;
    int amount;
    public Deposit(Account ac,int a){
        this.ac = ac;
        amount = a;
    }
    public void run(){
        ac.deposit(amount);
    }
}

class Withdraw extends Thread{
    Account ac;
    int amount;
    public Withdraw(Account ac,int a){
        this.ac = ac;
        amount = a;
    }
    public void run(){
        ac.withdraw(amount);
    }
}

public class PROGRAM33 {
    public static void main(String[] args) {
        Account ac = new Account();
        Deposit d = new Deposit(ac,10000);
        Withdraw w = new Withdraw(ac,500);
        Deposit d2 = new Deposit(ac,200);
        Withdraw w2 = new Withdraw(ac,2800);
        d.start();
        w.start();
        d2.start();
        w2.start();
    }
}


