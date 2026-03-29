/*PROGRAM 39 STRINGBUFFER CLASS
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 12/01/2026
*/

import java.util.*;

public class PROGRAM39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial string: ");
        String initial = sc.nextLine();
        StringBuffer sb = new StringBuffer(initial);
        int choice;

        while (true) {
            System.out.println("Current String: " + sb);
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Replace");
            System.out.println("4. Delete");
            System.out.println("5. Reverse");
            System.out.println("6. Display Capacity");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter string to append: ");
                    String toAppend = sc.nextLine();
                    sb.append(toAppend);
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter string to insert: ");
                    String toInsert = sc.nextLine();
                    sb.insert(index, toInsert);
                    break;
                case 3:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter replacement string: ");
                    String toReplace = sc.nextLine();
                    sb.replace(start, end, toReplace);
                    break;
                case 4:
                    System.out.print("Enter start index: ");
                    int delStart = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int delEnd = sc.nextInt();
                    sb.delete(delStart, delEnd);
                    break;
                case 5:
                    sb.reverse();
                    System.out.println("Reversed String: " + sb);
                    break;
                case 6:
                    System.out.println("Current Capacity: " + sb.capacity());
                    break;
                case 7:
					sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
