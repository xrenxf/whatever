package SD.modul1;
import java.util.*;

public class Segitiga<T extends Number>{
    private T alas, tinggi;

    public void Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    int getResultAsInt(){
        return (int)(0.5 * alas.intValue() * tinggi.intValue());
    }

    double getResultAsDouble(){ return (double) (0.5 * alas.doubleValue() * tinggi.doubleValue());}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        Segitiga<Integer> LuasTipeInt = new Segitiga<>();
        Segitiga<Double> LuasTipeDouble = new Segitiga<>();

        while (true) {
            System.out.println("\t === HITUNG LUAS SEGITIGA ===\n" +
                    "Mau menampilkan hasil luas dalam bentuk ? :\n" +
                    "1. Hasil to Integer\n" +
                    "2. Hasil to Double\n" +
                    "Masukkan pilihan 1 / 2");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Nilai Alas dan Tinggi Secara Berurutan :");
                    LuasTipeInt.Segitiga(in.nextInt(), in.nextInt());
                    System.out.println("Luas Segitiga Dalam Integer : " + LuasTipeInt.getResultAsInt() + "\n");
                    break;
                case 2:
                    System.out.println("Masukkan Nilai Alas dan Tinggi Secara Berurutan :");
                    LuasTipeDouble.Segitiga(in.nextDouble(), in.nextDouble());
                    System.out.println("Luas Segitiga Dalam Double : " + LuasTipeDouble.getResultAsDouble() + "\n");
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}