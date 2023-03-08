package PBO.modul4C1;

//implementasi interface
public class Lingkaran implements BangunDatar{
    int jarijari = 7;
    double phi = 3.14, Luas, Keliling;

    //override
    public double Luas() {
        Luas = phi * (jarijari * jarijari);
        System.out.printf("Luas Lingkaran : %.2f \n",Luas);
        return Luas;
    }

    public double Keliling(){
        Keliling = 2 * phi * jarijari;
        System.out.printf("Keliling Lingkaran : %.2f \n",Keliling);
        return Keliling;
    }
}