package PBO.modul4A;

//inheritance
public class Bola extends BangunRuang {
    //attribut class
    double phi = 3.14, jari;

    //constructor
    protected void setjari(double jari){
        this.jari = jari;
    }
    protected double getjari(){
        return jari;
    }

    protected double getLuasPermukaan(){
        return 4 * phi * getjari() * getjari();
    }
    protected double getVolume(){ return 1.33 * phi * getjari() * getjari() * getjari();}
}