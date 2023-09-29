package PBO.modul3b;
import PBO.modul3a.Film;

public class Aktor extends Film{
    //SubClass/Child Class/Deriver Class
    //extends untuk menerapkan inheritance
    private String aktor;
    protected String namaClass = "Kategori Umur";

    protected void setAktor(String aktor){ this.aktor = aktor;}

    protected String getAktor(){ return aktor;}

    protected String keterangan(){ return ("ini adalah class " +namaClass);}

    protected String keterangan_film(){ return super.namaClass+  " : "  +super.keterangan();}
    //Keyword “super” digunakan oleh subclass untuk memanggil constructor, atribut dan method yang ada pada superclass-nya
    //memanggil constructor = super()
    //memanggil atribut dan method = super.namaAtribut / super.namaMethod()

    protected void hapus(){
        //menghapus variable private dari memory
        aktor = null;
        //menghapus variable private parent (class film)
        super.hapus();
    }
}