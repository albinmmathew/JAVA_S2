/*PROGRAM 46 URL INFO
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 19/01/2026
*/

import java.net.*;

public class PROGRAM46 {
    public static void main(String args[]) {
        try {
            URL url = new URL("https://www.google.com");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
            System.out.println("Path: " + url.getPath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
