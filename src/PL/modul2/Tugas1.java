package PL.modul2;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Tugas2 a = new Tugas2();
        Scanner in = new Scanner(System.in);
        String nama, nim, email, alamat;
        int repeat;

        System.out.println("Nama    : ");
        nama = in.next();
        do {
            repeat = 1;
            try {
                System.out.print("NIM   : ");
                nim = in.next();

                if (nim.matches("[a-z]*")) {
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

        do {
            repeat = 1;
            try {
                System.out.println("E-mail  : ");
                email = in.next();

                if (email.contains("@webmail.umm.ac.id") == false) {
                    System.out.println("Harus Menggunakan E-mail UMM");
                    repeat = 0;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(repeat == 0);

        System.out.println("Alamat  : ");
        alamat = in.next();
    }
}