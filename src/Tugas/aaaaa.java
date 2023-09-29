package Tugas;
import java.util.Scanner;

public class aaaaa {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Java Konversi Suhu  ##");
        System.out.println("==================================");
        System.out.println();

        double celc, fahr, kelv, ream;
        String celci;
        int repeat;

        do {
            repeat = 1;
            try {
                System.out.print("Input Suhu Celsius: ");
                celc = input.nextDouble();

                fahr = (9.0/5.0 * celc) + 32;
                kelv = celc + 273.15;
                ream = celc * (4.0/5.0) ;

                System.out.println(celc+" derajat Celcius = "+fahr+" derajat Fahrenheit");
                System.out.println(celc+" derajat Celcius = "+kelv+" derajat Kelvin");
                System.out.println(celc+" derajat Celcius = "+ream+" derajat Reamur");
            }catch (Exception e){
                System.out.println(e);
            }
        }while (repeat == 0);
    }
}