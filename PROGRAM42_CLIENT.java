/*PROGRAM 42 DOWNLOAD CONTENT FROM SERVER
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 17/01/2026
*/

import java.io.*;
import java.net.*;

public class PROGRAM42_CLIENT {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 1234);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter filename to download from server: ");
            String filename = br.readLine();
            dout.writeUTF(filename);

            String line;
            String savePath = "clientfile/" + filename;
            PrintWriter pw = new PrintWriter(new FileWriter(savePath));

            System.out.println("Downloading content to " + savePath + "...");
            while (!(line = din.readUTF()).equals("EOF")) {
                pw.println(line);
            }
            pw.close();
            System.out.println("Download complete.");
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
