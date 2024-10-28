import java.io.*;

public class Q032 {
    
    static class Classes implements Serializable {
        String id;
    }

    static class Person {
        String name;
        transient String address; // 標記為 transient
    }

    static class Student extends Person implements Serializable {
        String studentNo;
        Classes classes = new Classes();
    }

    public static void main(String[] args) {
        // 創建一個 Student 物件
        Student student = new Student();
        student.name = "李";
        student.studentNo = "12345";
        student.address = "台北市"; // 設定 address
        student.classes.id = "Class A";
        
        // 序列化物件
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 反序列化物件
        Student deserializedStudent = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            deserializedStudent = (Student) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 驗證 address 欄位
        System.out.println("Name: " + deserializedStudent.name); // 應該是 "李"
        System.out.println("Student No: " + deserializedStudent.studentNo); // 應該是 "12345"
        System.out.println("Address: " + deserializedStudent.address); // 應該是 null
        System.out.println("Class ID: " + deserializedStudent.classes.id); // 應該是 "Class A"
    }
}
/*
Which fields are serialized in a Student object?
A. studentNo and classes
B. studentNo and name
C. studentNo, classes and name
D. studentNo, classes, name, and address
*/