package SD.modul1;

public class Kota<E> {
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : " + jumlahKota.getElement() + " kota");
        System.out.println("Salah Satu Kota du Jawa Timur : Kota " + namaKota.getElement());
    }
}