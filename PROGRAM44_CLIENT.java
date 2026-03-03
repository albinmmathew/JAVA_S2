/*PROGRAM 44 PUBLIC CHATTING
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 17/01/2026
*/

import java.io.*;
import java.net.*;

class ClientReceive extends Thread {
	Socket as;
	DataInputStream sin;
	public ClientReceive(Socket cs) throws Exception {
		as = cs;
		sin = new DataInputStream(as.getInputStream());
	}
	public void run() {
		try {
			for(;;){
				String str = sin.readUTF();
				System.out.println(str);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


public class PROGRAM44_CLIENT {
    public static void main(String args[]) {
        try {
			Socket cs = new Socket("localhost",1234);
			DataInputStream kin;
			DataOutputStream sout;
			sout = new DataOutputStream(cs.getOutputStream());
			kin = new DataInputStream(System.in);
			String str;
			ClientReceive cr = new ClientReceive(cs);
			cr.start();
			System.out.println("Enter your name: ");
			String name = kin.readLine();
			for(;;) {
				System.out.println("Enter data/quit");
				str = kin.readLine();
				sout.writeUTF(name + " says: " + str);
				if(str.equals("quit")){
					cs.close();
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error " + e);
		}
    }
}
