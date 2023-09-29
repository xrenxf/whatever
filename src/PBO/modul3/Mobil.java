package PBO.modul3;

public class Mobil extends Kendaraan{
    //SubClass/Child Class/Deriver Class
    //extends untuk menerapkan inheritance
    private String merk, warna;

    protected void setMerk(String merk){ this.merk = merk;}

    protected String getMerk(){ return merk;}

    protected void setWarna(String warna){ this.warna = warna;}

    protected String getWarna(){ return warna;}
}