package SD.modul2;

import java.util.ArrayList;
public class HewanTugas {
    public static void main(String[] args) {
        // Add data
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("HewanTugas yang berhasil di tambahkan : ");
        System.out.println(hewan);

        // Delete data
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        // Save data yang dihapus ke Delete DataPraktikan HewanTugas
        ArrayList<String> DelDataHewan = new ArrayList<>();
        for (String warna : DeleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            DelDataHewan.add(warna);
        }

        System.out.println("DataPraktikan HewanTugas yang Telah Dihapus : ");
        System.out.println(DelDataHewan);

        System.out.println("Output HewanTugas : ");
        System.out.println(hewan);

    }
}