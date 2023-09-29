package PBO.modul3;

public class Kendaraan {
    //Class Utama/Super Class/Parent Class/Base Class
    String merk, warna;

    protected void merk(String merk){ System.out.println(merk);}

    protected void warna(String warna){
        System.out.println(warna);
    }

    protected void hapus(){
        //menghapus variable private dari memory
        merk = null;
        warna = null;
    }
}
//Inheritance = mewariskan atau menurunkan property, method atau data ke subclass/child class
//is-a = class turunan atau pengimplementasian interface
//is-a dalam java melalui keyword extends(untuk inheritance) dan implements(untuk implementasi interface)
//overloading = sebuah class mempunyai 2 atau lebih method dengan nama yang sama, parameter berbeda
//super = keyword untuk mengakses superclass
//modifier = hak akses variable/method/class (public, protected, private)