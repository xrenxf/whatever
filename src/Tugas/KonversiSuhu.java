package Tugas;
import java.util.Scanner;

public class KonversiSuhu {
    static double SuhuAwal;
    static char Awal;

    public static void main(String[] args) {
        // TODO code application logic here
        Celcius fromCelcius = new Celcius();
        Fahrenheit fromFahrenheit = new Fahrenheit();
        Reamur fromReamur = new Reamur();
        Kelvin fromKelvin = new Kelvin();

        double Fahrenheit, Kelvin,Celcius,Reamur;
        boolean valid=false;
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Suhu");
        while(valid!=true)
        {
            try {
                System.out.print("Masukkan suhu awal dan derajatnya (D/F/R/K) (misal : 100 C): ");
                SuhuAwal = input.nextDouble();
                Awal = input.next().charAt(0);
            }catch (Exception e){
                System.out.println("Masukkan suhu secara benar [C,F,K,R]");
            }

            switch(Awal){
                case 'C':
                    Reamur = fromCelcius.toReamur();
                    Fahrenheit = fromCelcius.toFahrenheit();
                    Kelvin = fromCelcius.toKelvin();
                    System.out.println("Suhu awal =" + SuhuAwal + " Celcius\nHasil :");
                    System.out.println("Fahrenheit : " + Fahrenheit);
                    System.out.println("Kelvin : " + Kelvin);
                    System.out.println("Reamur : " + Reamur);
                    valid = true;
                    break;
                case 'F':
                    Celcius = fromFahrenheit.toCelcius();
                    Reamur = fromFahrenheit.toReamur();
                    Kelvin = fromFahrenheit.toKelvin();
                    System.out.println("Suhu awal ="+SuhuAwal+" Fahrenheit\nHasil:");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Kelvin : "+Kelvin);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'K':
                    Celcius = fromKelvin.toCelcius();
                    Reamur = fromKelvin.toReamur();
                    Fahrenheit = fromKelvin.toFahrenheit();
                    System.out.println("Suhu awal ="+SuhuAwal+" Kelvin\nHasil:");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'R':
                    Celcius = fromReamur.toCelcius();
                    Fahrenheit = fromReamur.toFahrenheit();
                    Kelvin = fromReamur.toKelvin();
                    System.out.println("Suhu awal ="+SuhuAwal+" Reamur\nHasil:");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Kelvin : "+Kelvin);
                    valid=true;
                    break;
                default :
                    System.out.println("Masukkan suhu secara benar [C,F,K,R]");
            }
        }
    }
}