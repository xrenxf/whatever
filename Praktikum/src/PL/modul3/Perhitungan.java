package PL.modul3;

public class Perhitungan {
    private Balok sisi;
    private int luas, volume;

    void Perhitungan(){
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        extracted(panjang, lebar, tinggi);

        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();
        extracted1(panjangV, lebarV, tinggiV);
    }

    private void extracted(int panjang, int lebar, int tinggi) {
        luas = panjang * lebar * tinggi;
    }

    private void extracted1(int panjangV, int lebarV, int tinggiV) {
        volume = 4 * panjangV * lebarV * tinggiV;
    }

    public int luas(Balok sisi){
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public int volume(Balok sisi){
        return 4 * sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    public static boolean isCube(long input) {
        long a = Math.round(Math.cbrt(input));
        return (a * a * a) == input;
    }
}