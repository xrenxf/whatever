package PL.modul3;
import java.util.Scanner;

public class Balok {
    int panjang, lebar, tinggi;

    public void setPanjang(int panjang){this.panjang = panjang;}
    public int getPanjang(){return panjang;}
    public void setLebar(int lebar){this.lebar = lebar;}
    public int getLebar(){return lebar;}
    public void setTinggi(int tinggi){this.tinggi = tinggi;}
    public int getTinggi(){return tinggi;}

    protected void hasil(){
        Perhitungan ph = new Perhitungan();
        Scanner in = new Scanner(System.in);
        System.out.println("Luas & Volume Balok");
        System.out.println("Panjang : ");
        panjang = in.nextInt();
        setPanjang(panjang);
        System.out.println("Lebar : ");
        lebar = in.nextInt();
        setLebar(lebar);
        System.out.println("Tinggi : ");
        tinggi = in.nextInt();
        setTinggi(tinggi);
        System.out.println("Hasil Luas Balok : " +ph.luas(this));
        System.out.println("Hasil Volume Balok : " +ph.volume(this));
        System.out.println("Hasil Cube : " + ph.isCube(8));
    }

    public void Perhitungan(){}
}