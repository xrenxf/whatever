package PBO.modul3a;
import PBO.modul3b.Aktor;
import javax.swing.JOptionPane;

public class MainFilm extends Aktor{
    public static void main(String[] args){
        MainFilm b = new MainFilm();
        String judul, aktor;

        b.nama(b.keterangan_film());
        b.nama(b.keterangan());
        judul = JOptionPane.showInputDialog("Judul Film : ");
        b.setJudul(judul);
        b.tampil("Judul Film : " +b.getJudul());

        aktor = JOptionPane.showInputDialog("Aktor : ");
        b.setAktor(aktor);
        b.tampil("Aktor : " +b.getAktor());

        aktor = JOptionPane.showInputDialog("Kategori Umur : ");
        b.setAktor(aktor);
        b.tampil("Kategori Umur : " +b.getAktor());

        b.hapus();

        System.exit(0);
    }
}