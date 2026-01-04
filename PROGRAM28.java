/*PROGRAM 28 SEARCHING IN N/5 THREADS
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 20/12/2025
*/

import java.util.*;

class SearchThread extends Thread {
    int arr[];
    int start, end, key;

    public SearchThread(int arr[], int start, int end, int key) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.key = key;
    }

    public void run() {

        for (int i = start; i < end; i++) {
            if(i==(arr.length))
            {
                break;
            }
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
            }
        }
    }   
}

public class PROGRAM28 {
    public static void main(String args[]) {
        int index;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = s.nextInt();

        int th = n / 5;
        for (int i = 0; i <= th; i++) {
            index=i*5;
            SearchThread t = new SearchThread(arr, index, index + 5, key);
            t.start();
        }
    }
}