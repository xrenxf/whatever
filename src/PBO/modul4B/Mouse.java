package PBO.modul4B;

//interface class
public interface Mouse {
    String jenis = "Laser Mouse";
    //method Interface harus public
    void klik_kanan();
    void klik_kiri();
    //tidak boleh ada method normal/biasa yang terdapat isi method-nya
}
//interface digunakan untuk mendeklarasikan sifat-sifat yang nantinya akan diimplementasi oleh class sesuai dengan kebutuhan