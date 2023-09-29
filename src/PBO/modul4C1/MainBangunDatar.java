package PBO.modul4C1;

public class MainBangunDatar {
    public static void main (String[] args){
        BangunDatar a = new Persegi();
        BangunDatar c = new Lingkaran();

        Tabung ab = new Tabung();
        Limas cd = new Limas();

        a.Keliling();
        a.Luas();

        c.Luas();
        c.Keliling();

        ab.getVolume();
        cd.getVolume();
    }
}