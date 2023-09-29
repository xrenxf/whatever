package PBO.modul4C1;

//inherit
public class Limas extends Persegi{
    int tinggi = 10;
    double Volume;

    public double getVolume(){
        Volume = 0.33 * (sisi * sisi) * tinggi;
        System.out.printf("Volume Limas : %.2f \n",Volume);
        return Volume;
    }
}