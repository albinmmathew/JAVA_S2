import java.io.*;
import java.net.*;
import java.util.*;

public class PROGRAM40_CLIENT {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("localhost", 1234);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String welcome = dis.readUTF();
            System.out.println("Server says: " + welcome);
            System.out.print("Enter message for server: ");
            String msg = sc.nextLine();
            dos.writeUTF(msg);
            String response = dis.readUTF();
            System.out.println("Server says: " + response);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
