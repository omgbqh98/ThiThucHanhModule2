package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void readFile() {
        String csvFile = "contacts.csv";
        String line = "";
        String cvsSlitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSlitBy);
                System.out.println("Country [code= " + country[4] + ", name =" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

