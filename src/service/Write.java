package service;

import java.io.*;

public class Write {
    public static void write() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("bookPhone.dat")));
            objectOutputStream.writeObject(objectOutputStream);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
