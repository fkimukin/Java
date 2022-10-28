package day26;

import java.io.FileInputStream;
import java.io.IOException;

public class E03 {
    public static void main(String[] args) {

        try {
            readTheText();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }


    public static void readTheText() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day26/TextFile.txt");

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);

        }


    }
}