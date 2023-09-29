package PBO.modul3a;

public class Film {
    //Class Utama/Super Class/Parent Class/Base Class
    private String judul;
    protected String namaClass = "Film";

    protected void setJudul(String judul){ this.judul = judul;} //menghapus variable parameter dari memory

    protected String getJudul(){ return judul;}

    protected void tampil(String tampil){
        System.out.println(tampil);
    }

    protected void nama(String nama){
        System.out.println(nama);
        namaClass = null;
    }

    protected String keterangan(){ return ("ini adalah class " +namaClass);}

    protected void hapus(){
        //menghapus variable private dari memory
        judul = null;
        namaClass = null;
    }
}