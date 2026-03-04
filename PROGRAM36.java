/*PROGRAM 36 GENERIC METHOD
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 05/01/2026
*/

import java.io.*;
import java.util.*;

public class PROGRAM36 {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "A", "B", "C", "D" };

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);
    }
}
