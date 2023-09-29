package PBO.modul4C1;

//implementasi interface
public class Persegi implements BangunDatar{
    int sisi = 5;
    double Luas, Keliling;

    //override
    public double Luas() {
        Luas = sisi * sisi;
        System.out.printf("Luas Lingkaran : %.2f \n",Luas);
        return Luas;
    }

    public double Keliling() {
        Keliling = 4 * sisi;
        System.out.printf("Keliling Lingkaran : %.2f \n",Keliling);
        return Keliling;
    }
}