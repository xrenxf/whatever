package SD.modul2;
import java.util.*;

public class HewanArrayList {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        //Deklarasi objek untuk memanggil hewan
        //Collection : menyimpan sekumpulan objek (generic)
        //ArrayList : Array yang berupa objek
        //interface list : menyimpan objek berdasarkan urutan masuk (order) dan menerima duplikat

        hewan.add(0,"Angsa");
        hewan.add(1,"Bebek");
        hewan.add(2,"Cicak");
        hewan.add(3,"Domba");
        hewan.add(4,"Elang");
        hewan.add(5,"Gajah");
        hewan.add(6,"Badak");
        hewan.add(7,"Bebek");

        System.out.println("\nOutput 1,2 :");
        System.out.println(hewan);
        System.out.println("Bebek = 2");
        System.out.println("Posisi Index = "+hewan.indexOf("Bebek")+"," +hewan.lastIndexOf("Bebek"));
        //menampilkan posisi indek "bebek" pada object

        hewan.remove(1);
        System.out.println("\nOutput 3 :\n"+hewan);
        //hapus index "bebek" pertama

        System.out.println("\nOutput 4 :");
        System.out.println("Index ke-0 : "+hewan.get(0));
        System.out.println("Index ke-2 : "+hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);
        //menampilkan index 0 & 2 || menghapus index 0

        System.out.println("\nOutput 5 :");
        hewan.set(0,"Ular");
        System.out.println(hewan);
        hewan.add(2,"Itik");
        System.out.println(hewan);
        //mengubah index 0 "cicak" menjadi "ular" || menambah index ke-2 dengan "itik"

        System.out.println("\nOutput 6 :");
        hewan.subList(2,5).clear();
        System.out.println(hewan);
        //hapus index antara 1 & 5

        System.out.println("\nOutput 7 :");
        System.out.println("Elemen pertama : "+hewan.get(0));
        System.out.println("Elemen Terakhir : "+hewan.get(hewan.size()-1));
        //menampilkan first & last index

        System.out.println("\nOutput 8,9 :");
        System.out.println("Jumlah index : "+hewan.size());
        System.out.println("Posisi index Badak : "+hewan.indexOf("Badak"));
        //menampilkan jumlah elemen pada ArrayList || cari index "bebek"
    }

}