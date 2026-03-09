/*PROGRAM 48 CONTENT OF A WEBPAGE
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 31/01/2026
*/

import java.io.*;
import java.net.*;

public class PROGRAM48 {
    public static void main(String args[]) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlcon = url.openConnection();
            InputStream is = urlcon.getInputStream();
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
