/*PROGRAM 20 ISHAPE INTERFACE
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 10/12/2025
*/


import java.util.Scanner;

interface ishape{
    public void draw();
    public void mov();
}
class Circle implements ishape {
    public void draw(){
        System.out.println("Drawing Circle");
    }
    public void mov(){
        System.out.println("Moving Circle");
    }
}   
class Rectangle implements ishape {
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    public void mov(){
        System.out.println("Moving Rectangle");
    }
}

class PROGRAM20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ishape obj;
        while (true) {
            System.out.println("1 - Circle");
            System.out.println("2 - Rectangle");
            System.out.println("3 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj = new Circle();
                    obj.draw();
                    obj.mov();
                    break;
                case 2:
                    obj = new Rectangle();
                    obj.draw();
                    obj.mov();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE!!");
                    break;
            }
        }
    }
}

