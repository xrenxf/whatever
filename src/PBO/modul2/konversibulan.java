package PBO.modul2;
import java.util.Scanner;


public class konversibulan {
    Scanner in = new Scanner(System.in);

    String menu;
    int bulan, bulan_hari = 30, bulan_jam = 720, bulan_menit = 43200, bulan_detik = 2592000;
    double jumlahhari, jumlahjam, jumlahmenit, jumlahdetik;
    boolean lanjutkan = true;

    int getbulan(){return bulan;}

    public void konversi() {
        System.out.println("Mengkonversi Waktu Bulan ke- (detik, menit, jam, hari)");
        System.out.println("\t\t\t MENU");
        System.out.println("=============================");
        System.out.println("1. Konversi Bulan ke Hari");
        System.out.println("2. Konversi Bulan ke Jam");
        System.out.println("3. Konversi Bulan ke Menit");
        System.out.println("4. Konversi Bulan ke Detik");
        System.out.println("5. Exit");

        while (lanjutkan) {
            System.out.println("Pilih Menu : ");
            menu = in.next();

            switch(menu) {
                case "1":
                    System.out.println("Masukan jumlah bulan : ");
                    bulan = in.nextInt();
                    jumlahhari = bulan * bulan_hari;
                    System.out.println(getbulan() + "Bulan : " + jumlahhari + " hari");
                    break;

                case "2":
                    System.out.println("Masukan jumlah bulan : ");
                    bulan = in.nextInt();
                    jumlahjam = bulan * bulan_jam;
                    System.out.println(getbulan() + "Bulan : " + jumlahjam + " jam");
                    break;

                case "3":
                    System.out.println("Masukan jumlah bulan : ");
                    bulan = in.nextInt();
                    jumlahmenit = bulan * bulan_menit;
                    System.out.println(getbulan() + "Bulan : " + jumlahmenit + " menit");
                    break;

                case "4":
                    System.out.println("Masukan jumlah bulan : ");
                    bulan = in.nextInt();
                    jumlahdetik = bulan * bulan_detik;
                    System.out.println(getbulan() + "Bulan : " + jumlahdetik + " detik");
                    break;

                case "5":
                    System.exit(0);
                    break;

                default:
                    System.err.println("Please Select Menu No 1, 2, 3, 4, or 5");
            }
            System.out.println("Apakah anda ingin melanjutkan (y/n)? ");
            menu = in.next();
            lanjutkan = menu.equalsIgnoreCase("y");
        }
    }
    public static void main(String[] args) {
        konversibulan c = new konversibulan();
        c.konversi();
    }
}