/*PROGRAM 43 UPLOAD CONTENT TO SERVER
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 17/01/2026
*/

import java.io.*;
import java.net.*;

public class PROGRAM43_SERVER {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is ready to receive upload...");
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());

            String filename = din.readUTF();
            String savePath = "serverfile/" + filename;
            PrintWriter pw = new PrintWriter(new FileWriter(savePath));

            String line;
            System.out.println("Receiving and saving content to " + savePath + "...");
            while (!(line = din.readUTF()).equals("EOF")) {
                pw.println(line);
            }
            pw.close();
            System.out.println("Upload complete.");
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
