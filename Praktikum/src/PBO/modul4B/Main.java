package PBO.modul4B;

public class Main {
    public static void main(String[] args){
        System.out.println("Komputer : ");
        Komputer komputer_baru = new Komputer();
        komputer_baru.klik_kanan();
        komputer_baru.klik_kiri();
        komputer_baru.double_klik();
        System.out.println("====================");

        System.out.println("PC : ");
        PC pc_baru = new PC();
        pc_baru.tekan_enter();
        System.out.println("====================");

        System.out.println("Laptop : ");
        Laptop laptop_baru = new Laptop();
        laptop_baru.jenis();
        laptop_baru.klik_kanan();
        laptop_baru.klik_kiri();
        laptop_baru.double_klik();
        laptop_baru.tekan_enter();
    }
}
//Polimorfisme = kemampuan objek-objek yang berbeda kelas namun terkait dalam pewarisan untuk merespon secara berbeda terhadap suatu pesan yang sama
//Has-a = Ketika objek dari satu kelas dibuat sebagai anggota data di dalam kelas lain