import java.net.*;

public class PROGRAM45_CLIENT {
    public static void main(String args[]) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String str = "Hello UDP Server";
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 1234);
            ds.send(dp);
            ds.close();
            System.out.println("Message sent via UDP.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
