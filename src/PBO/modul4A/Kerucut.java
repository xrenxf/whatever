package PBO.modul4A;

//inheritance
public class Kerucut extends BangunRuang {
    //attribut class
    double phi = 3.14, jari, selimut, tinggi;

    //constructor
    protected void setjari(double jari){
        this.jari = jari;
    }
    protected double getjari(){
        return jari;
    }
    protected void setselimut(double selimut){
        this.selimut = selimut;
    }
    protected double getselimut(){
        return selimut;
    }
    protected void settinggi(double tinggi){
        this.tinggi = tinggi;
    }
    protected double gettinggi(){
        return tinggi;
    }

    protected double getLuasPermukaan(){
        return (phi * getjari() * getjari()) + (phi * getjari() + getselimut());
    }
    protected double getVolume(){
        return 0.33 * phi * getjari() * getjari() * gettinggi();
    }
}