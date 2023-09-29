package PBO.modul4C1;

//inherit
public class Tabung extends Lingkaran{
    int tinggi = 10;
    double Volume;

    public double getVolume(){
        Volume = phi * (jarijari * jarijari) * tinggi;
        System.out.printf("Volume Tabung : %.2f \n",Volume);
        return Volume;
    }
}