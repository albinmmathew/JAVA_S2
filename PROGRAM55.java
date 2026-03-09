/*PROGRAM 55 IS-A SERIALIZATION
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 07/02/2026
*/

import java.io.*;

class Person implements Serializable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    String course;
    int fee;

    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }

    public void display() {
        System.out.println(id + " " + name + " " + course + " " + fee);
    }
}

public class PROGRAM55 {
    public static void main(String args[]) {
        String filename = "isa_student.ser";
        Student s1 = new Student(211, "Albin", "CS", 50000);

        // Serialization
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("IS-A Object serialized successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }

        // De-serialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            Student s = (Student) in.readObject();
            System.out.println("IS-A Object de-serialized successfully:");
            s.display();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
