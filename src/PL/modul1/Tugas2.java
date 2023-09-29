package PL.modul1;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        int repeat;
        Scanner in = new Scanner(System.in);
        String nim;

        do{
            repeat = 1;
            try {
                System.out.print("Masukkan NIM : ");
                nim = in.next();

                if(nim.matches("[a-z]*")){
                    System.out.println("Harus Angka");
                    repeat = 0;
                }
                if (nim.length() < 15 || nim.length() > 15) {
                    System.out.println("Harus Berjumlah 15 Angka");
                    repeat = 0;
                }
                if (nim.contains("10370311") == false) {
                    System.out.println("Harus Mengandung 10370311");
                    repeat = 0;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }while(repeat == 0);

        System.out.println("SUCCESS");
    }
}