package PBO.modul3;
import javax.swing.JOptionPane;

public class MainKendaraan {
    public static void main (String[] args){
        Kendaraan a = new Kendaraan();
        Bus b = new Bus();
        Mobil c = new Mobil();
        Motor d = new Motor();
        Sepeda e = new Sepeda();
        Kapal f = new Kapal();
        String merk, warna;

        System.out.println("\t\t BUS");
        merk = JOptionPane.showInputDialog("Merk Bus : ");
        b.setMerk(merk);
        b.merk("Merk Mobil  : " +b.getMerk());

        warna = JOptionPane.showInputDialog("Warna Bus : ");
        b.setWarna(warna);
        b.warna("Warna Bus : " +b.getWarna());

        System.out.println("\t\t MOBIL");
        merk = JOptionPane.showInputDialog("Merk Mobil : ");
        c.setMerk(merk);
        c.merk("Merk Mobil  : " +c.getMerk());

        warna = JOptionPane.showInputDialog("Warna Mobil : ");
        c.setWarna(warna);
        c.warna("Warna Mobil : " +c.getWarna());

        System.out.println("\t\t MOTOR");
        merk = JOptionPane.showInputDialog("Merk Motor : ");
        d.setMerk(merk);
        d.merk("Merk Motor  : " +d.getMerk());

        warna = JOptionPane.showInputDialog("Warna Motor : ");
        d.setWarna(warna);
        d.warna("Warna Motor : " +d.getWarna());

        System.out.println("\t\t SEPEDA");
        merk = JOptionPane.showInputDialog("Merk Sepeda : ");
        e.setMerk(merk);
        e.merk("Merk Sepeda  : " +e.getMerk());

        warna = JOptionPane.showInputDialog("Warna Sepeda : ");
        e.setWarna(warna);
        e.warna("Warna Sepeda : " +e.getWarna());

        System.out.println("\t\t KAPAL");
        merk = JOptionPane.showInputDialog("Merk Kapal : ");
        f.setMerk(merk);
        f.merk("Merk Kapal  : " +f.getMerk());

        warna = JOptionPane.showInputDialog("Warna Kapal : ");
        f.setWarna(warna);
        f.warna("Warna Kapal : " +f.getWarna());

        a.hapus();

        System.exit(0);
    }

}