package Tugas;

public class Reamur {
    double toFahrenheit(){
        //°F = °Ré × 2,25 + 32
        return (KonversiSuhu.SuhuAwal*2.25+32);
    }
    double toKelvin(){
        //K = °Ré / 0,8 + 273,15
        return (KonversiSuhu.SuhuAwal/0.8+237.15);
    }
    double toCelcius(){
        //°C = °Ré / 0,8
        return (KonversiSuhu.SuhuAwal/0.8);
    }
}