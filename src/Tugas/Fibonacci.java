package Tugas;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int f_n, f_n1, f_n2, i, n;
        boolean kondisi = true;
        System.out.println("masukkan nilai n = ");
        n = in.nextInt();
        i = 0;

        f_n = 1;
        f_n1 = 0;
        f_n2 = 1;
        while (kondisi) {
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
            i++;


            System.out.println("nilai fibonacci ke " + i + " = " + f_n);
            if (i == n) {
                kondisi = false;

            }
        }
    }
}

/*import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        // Mendeklarasikan variable
        int fn, fn_1, fn_2, n, index;
        Scanner inputUser = new Scanner(System.in);

        // Assignment semua variable
        System.out.print("Mengambil nilai fibonacci ke - ");
        n = inputUser.nextInt();

        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
        index = 1;

        // Menggunakan `While Loop`

        System.out.println("--- While Loop ---");
        while (index <= n) {
            System.out.printf("Nilai ke - %d adalah: %d\n", index, fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            index++;
        }
        System.out.println("------------------");

        // Menetapkan ulang semua variable

        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
        index = 1;

        // Menggunakan `Do While Loop`

        System.out.println("--- Do While Loop ---");

        do {
            System.out.printf("Nilai ke - %d adalah: %d (%d + %d)\n", index, fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            index++;
        } while (index <= n);

        System.out.println("---------------------");

    }

}*/