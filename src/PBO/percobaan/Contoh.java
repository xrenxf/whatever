package PBO.percobaan;
import java.io.FileInputStream;
import java.io.IOException;

public class Contoh {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println((char)inputFile.read());
    }
}