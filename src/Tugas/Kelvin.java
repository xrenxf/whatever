package Tugas;

public class Kelvin {
    double toFahrenheit(){
        //°F = K × 1,8 − 459,67
        return (KonversiSuhu.SuhuAwal*1.8-459.67);
    }
    double toReamur(){
        //°Ré = (K − 273,15) × 0,8
        return ((KonversiSuhu.SuhuAwal-273.15)*0.8);
    }
    double toCelcius(){
        //°C = K − 273,15
        return (KonversiSuhu.SuhuAwal-273.15);
    }
}