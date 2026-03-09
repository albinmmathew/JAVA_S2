/*PROGRAM 54 SERIALIZATION AND DE-SERIALIZATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 07/02/2026
*/

import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void disp() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class PROGRAM54 {
    public static void main(String args[]) {
        String filename = "student.ser";
        Student s1 = new Student(100, "Albin");

        // Serialization
        try {
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
            System.out.println("Serialization Error: " + e);
        }

        // De-serialization
        try {
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s = (Student) in.readObject();
            System.out.println("Object de-serialized successfully.");
            s.disp();
            in.close();
        } catch (Exception e) {
            System.out.println("De-serialization Error: " + e);
        }
    }
}
