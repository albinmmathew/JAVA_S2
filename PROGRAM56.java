/*PROGRAM 56 HAS-A SERIALIZATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 07/02/2026
*/

import java.io.*;

class Address implements Serializable {
    String addressLine;

    public Address(String addressLine) {
        this.addressLine = addressLine;
    }
}

class Student implements Serializable {
    int id;
    String name;
    Address address; // HAS-A Relationship

    public Student(int id, String name, String al) {
        this.id = id;
        this.name = name;
        this.address = new Address(al);
    }

    public void display() {
        System.out.println(id + " " + name + " " + address.addressLine);
    }
}

public class PROGRAM56 {
    public static void main(String args[]) {
        String filename = "hasa_student.ser";
        Student s1 = new Student(211, "Albin", "Rajagiri");

        // Serialization
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("HAS-A Object serialized successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }

        // De-serialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            Student s = (Student) in.readObject();
            System.out.println("HAS-A Object de-serialized successfully:");
            s.display();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
