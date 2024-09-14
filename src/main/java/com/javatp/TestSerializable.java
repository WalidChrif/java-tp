package com.javatp;

import com.javatp.entities.StudentId;

import java.io.*;

public class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        StudentId studentId = new StudentId(3L, "code");

        FileOutputStream fos = new FileOutputStream("ids.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentId);

        FileInputStream fis = new FileInputStream("ids.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        StudentId studentId1 = (StudentId) ois.readObject();
        System.out.print(studentId1);
    }
}
