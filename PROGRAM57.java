/*PROGRAM 57 TRANSIENT KEYWORD IN SERIALIZATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 09/02/2026
*/

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    transient int age; // This will not be serialized

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age (transient): " + age);
    }
}

public class PROGRAM57 {
    public static void main(String args[]) {
        String filename = "transient_student.ser";
        Student s1 = new Student(211, "Albin", 22);

        System.out.println("Original Object Data:");
        s1.display();

        // Serialization
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("\nObject with transient field serialized.");
        } catch (Exception e) {
            System.out.println(e);
        }

        // De-serialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            Student s = (Student) in.readObject();
            System.out.println("Object de-serialized.");
            s.display();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
