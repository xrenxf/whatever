package Tugas;
import java.util.Scanner;

public class KonversiSuhuSimple {
    public static void main(String[] args) {
        double C;
        Scanner suhu = new Scanner(System.in);

        System.out.println("Suhu Celcius : ");
        C = suhu.nextDouble();

        double R = 0.6 * C;
        double K = C + 273;
        double F = (1.8 * C) + 32;

        System.out.println("Suhu Reamur : " +R+ "derajat");
        System.out.println("Suhu Kelvin : " +K+ "derajat");
        System.out.println("Suhu Fahrenheit : " +F+ "derajat");
    }
}