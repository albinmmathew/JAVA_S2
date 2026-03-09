import java.io.*;
import java.net.*;

public class PROGRAM41_CLIENT {
    public static void main(String[] args) {
        Socket cs;
        DataInputStream sin, kin;
        DataOutputStream sout;
        try {
            cs = new Socket("localhost", 1234);
            kin = new DataInputStream(System.in);
            sin = new DataInputStream(cs.getInputStream());
            sout = new DataOutputStream(cs.getOutputStream());
            while (true) {
                String str = sin.readUTF();
                if (str.equals("quit"))
                    break;
                System.out.println("Server Says: " + str);
                System.out.println("Enter data / quit to terminate");
                str = kin.readLine();
                sout.writeUTF(str);
                if (str.equals("quit"))
                    break;
            }
            cs.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
