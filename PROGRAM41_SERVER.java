/*PROGRAM 41 ONE-ONE CHATTING
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 12/01/2026
*/

import java.io.*;
import java.net.*;

public class PROGRAM41_SERVER {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket as;
        DataInputStream sin, kin;
        DataOutputStream sout;
        try {
            ss = new ServerSocket(1234);
            as = ss.accept();
            kin = new DataInputStream(System.in);
            sin = new DataInputStream(as.getInputStream());
            sout = new DataOutputStream(as.getOutputStream());
            String str = "Welcome";
            while (true) {
                sout.writeUTF(str);
                if (str.equals("quit"))
                    break;
                str = sin.readUTF();
                if (str.equals("quit"))
                    break;
                System.out.println("Client Says: " + str);
                System.out.println("Enter data / quit to terminate");
                str = kin.readLine();
            }
            as.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
