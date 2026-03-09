/*PROGRAM 42 DOWNLOAD CONTENT FROM SERVER
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 17/01/2026
*/

import java.io.*;
import java.net.*;

public class PROGRAM42_SERVER {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is waiting...");
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            String filename = din.readUTF();
            File file = new File("serverfile/" + filename);

            if (file.exists()) {
                BufferedReader fr = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fr.readLine()) != null) {
                    dout.writeUTF(line);
                }
                fr.close();
            } else {
                dout.writeUTF("File not found");
            }
            dout.writeUTF("EOF");
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
