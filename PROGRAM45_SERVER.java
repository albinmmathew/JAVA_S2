/*PROGRAM 45 CONNECTIONLESS COMMUNICATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 19/01/2026
*/

import java.net.*;

public class PROGRAM45_SERVER {
    public static void main(String args[]) {
        try {
            DatagramSocket ds = new DatagramSocket(1234);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            System.out.println("UDP Server is waiting..");
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Received: " + str);
            System.out.println("Client Port Number: " + dp.getPort());
            ds.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
