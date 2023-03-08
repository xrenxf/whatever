package PBO.modul4A;

//abstract class
public abstract class BangunRuang {
    //method biasa
    protected void jari(String jari){ System.out.println(jari);}
    protected void selimut(String selimut){ System.out.println(selimut);}
    protected void tinggi(String tinggi){ System.out.println(tinggi);}
    protected void LuasPermukaan(String LuasPermukaan){ System.out.println(LuasPermukaan);}
    protected void Volume(String Volume){ System.out.println(Volume);}

    //abstract method
    protected abstract double getLuasPermukaan();
    protected abstract double getVolume();
}
/*abstract class digunakan untuk mendefinisikan konsep class yang sifatnya umum
abstract class tidak bisa dibuat objeknya, namun bisa dimanfaatkan dalam konsep polimorfisme
*/