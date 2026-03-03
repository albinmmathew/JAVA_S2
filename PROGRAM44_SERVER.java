/*PROGRAM 44 PUBLIC CHATTING
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 17/01/2026
*/

import java.io.*;
import java.net.*;
import java.util.*
;
class Node {
    Socket data;
    Node next;
    public Node(Socket data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    synchronized void insert(Socket data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
	synchronized void delete(Socket data){
		if (head == null) return; // Empty list

    	// If head node contains the data to delete
    	if (head.data.equals(data)) {
       		head = head.next;
        	return;
    	}

		// Search for the node to delete
		Node current = head;
		while (current.next != null && !current.next.data.equals(data)) {
			current = current.next;
		}

		// If found, bypass the node
		if (current.next != null) {
			current.next = current.next.next;
		}
	}
	synchronized void send(String str, Socket sender) {
		try {
			Node current = head;
			while (current != null) {
				if (!current.data.equals(sender)) {
					DataOutputStream dout =	new DataOutputStream(current.data.getOutputStream());
					dout.writeUTF(str);
				}
				current = current.next;
			}
		} catch (Exception e) {
			System.out.println("Send error: " + e);
		}
	}
}

class OneClient extends Thread {
	Socket as;
	DataInputStream sin;
	DataOutputStream sout;
	LinkedList ll;
	//String name;
	public OneClient(Socket s,LinkedList ll) throws Exception {
		as =s;
		sin = new DataInputStream(as.getInputStream());
		sout = new DataOutputStream(as.getOutputStream());
		this.ll = ll;
		//this.name = name;
	}
	public void run() {
		try {
			sout.writeUTF("Welcome..");
			while(true) {
				String str = sin.readUTF();
				if(str.equals("quit")){
					System.out.println("Client Disconnected..");
					ll.delete(as);
					break;
				}
				ll.send(str, as);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class PROGRAM44_SERVER {
    public static void main(String args[]) {
		ServerSocket ss;
		LinkedList ll = new LinkedList();
		try {
			ss = new ServerSocket(1234);
			for(;;) {
				System.out.println("Server Waiting.....");
				Socket as = ss.accept();
				ll.insert(as);
				System.out.println("Client Connected");
				OneClient obj = new OneClient(as,ll);
				obj.start();
			}
		}
		catch(Exception e) {
			System.out.println("Error " + e);
		}
    }
}
