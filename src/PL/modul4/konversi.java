package PL.modul4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hari;
        System.out.println("Jumlah hari : ");

        double tahun, sisa1, bulan, sisa2;
        hari = in.nextInt();
        tahun = hari/365;
        sisa1 = hari%365;
        bulan = sisa1/30;
        sisa2 = sisa1%30;

        DecimalFormat w = new DecimalFormat(" ");
        System.out.println(hari+ " hari = " +w.format(tahun)+ " tahun" +w.format(bulan)+ " bulan" +w.format(sisa2)+ " hari");
    }
}