package Tugas;

public class Celcius {
    double toFahrenheit(){
        //°F = °C × 1,8 + 32
        return (KonversiSuhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //°Ré = °C × 0,8
        return (KonversiSuhu.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = °C + 273,15
        return (KonversiSuhu.SuhuAwal+273.15);
    }
}