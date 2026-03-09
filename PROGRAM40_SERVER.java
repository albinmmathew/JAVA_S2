/*PROGRAM 40 SERVER CLIENT COMMUNICATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 12/01/2026
*/

import java.io.*;
import java.net.*;

public class PROGRAM40_SERVER {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is waiting for client...");
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Welcome...");
            String str = (String) dis.readUTF();
            System.out.println("Message from Client: " + str);
            dos.writeUTF("Message received successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
