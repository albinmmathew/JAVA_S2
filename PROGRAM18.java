/*PROGRAM 18 EMPLOYEE MANAGEMENT SYSTEM
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 09/12/2025
*/

import java.util.*;

class Employee {
    int eno;
    String ename;
    float esal;
    Scanner sc = new Scanner(System.in);
    public void read(){
        System.out.print("Enter Employee No: ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        esal = sc.nextFloat();
    }
    public void disp(){
        System.out.println("Employee No: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esal);
    }
    public boolean compare(int key){
        return eno == key;
    }
}

class PROGRAM18 {
    public static void main(String args[]){
            int i, n, key;
            boolean found = false;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of employees: ");
            n = sc.nextInt();
            Employee Emp[] = new Employee[n];
            for (i = 0; i<n; i++){
                Emp[i] = new Employee();
                Emp[i].read();
            }
            for (i = 0; i<n; i++){
                System.out.println("Employee " + (i+1) + " Details :");
                Emp[i].disp();
            }
            System.out.print("Enter the Employee number to search: ");
            key = sc.nextInt();
            for(i = 0; i<n; i++){
                if(Emp[i].compare(key)){
                    found = true;
                    System.out.println("Employee found");
                    Emp[i].disp();
                }
            }
            if(!found)
                System.out.println("Employee not found");
    }
}