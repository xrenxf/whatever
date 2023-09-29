package PBO.modul2;
import java.util.Scanner;

public class hitungnilai {
    Scanner in = new Scanner(System.in);

    int nilaiProgdas, nilaiOrkom, nilaiKalkulus;
    double Jumlah, Rata;

    int getnilaiProgdas(){return nilaiProgdas;}
    int getnilaiOrkom(){return nilaiOrkom;}
    int getnilaiKalkulus(){return nilaiKalkulus;}

    public void hitungRata(){
        System.out.println("\t Nilai Rata-rata");
        System.out.println("Nilai Progdas  : ");
        nilaiProgdas = in.nextInt();
        System.out.println("Nilai Orkom    : ");
        nilaiOrkom = in.nextInt();
        System.out.println("Nilai Kalkulus : ");
        nilaiKalkulus = in.nextInt();

        System.out.println("\n\t Nilai Anda");
        System.out.println("Nilai Progdas  : " + getnilaiProgdas());
        System.out.println("Nilai Orkom    : " + getnilaiOrkom());
        System.out.println("Nilai Kalkulus : " + getnilaiKalkulus());

        Jumlah = nilaiProgdas + nilaiOrkom + nilaiKalkulus;
        Rata = Jumlah/3;

        System.out.println("Jumlah nilai   : " + Jumlah);
        System.out.println("Rata-rata      : " + Rata);
        if (Rata >= 70){
            System.out.println("LULUS");
        }else{
            System.out.println("TIDAK LULUS");
        }
    }

    public static void main(String[] args){
        hitungnilai c = new hitungnilai();
        c.hitungRata();
    }

}