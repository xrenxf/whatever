package PBO.modul4A;
import javax.swing.*;

//final class
public final class MainBangunRuang {
    public static void main (String[] args){
        Kerucut a = new Kerucut();
        Bola b = new Bola();
        double jari, selimut, tinggi;

        System.out.println("\t\t KERUCUT");
        jari = Double.parseDouble(JOptionPane.showInputDialog("Jari-jari Kerucut : "));
        a.setjari(jari);
        a.jari("Jari-jari   : " +a.getjari());
        selimut = Double.parseDouble(JOptionPane.showInputDialog("Selimut Kerucut : "));
        a.setselimut(selimut);
        a.selimut("Selimut  : " +a.getselimut());
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Tinggi Kerucut : "));
        a.settinggi(tinggi);
        a.tinggi("Tinggi   : " +a.gettinggi());
        a.LuasPermukaan("Luas Permukaan Kerucut : " +a.getLuasPermukaan());
        a.Volume("Volume Kerucut : " +a.getVolume());

        System.out.println("\t\t BOLA");
        jari = Double.parseDouble(JOptionPane.showInputDialog("Jari-jari Bola : "));
        b.setjari(jari);
        b.jari("Jari-jari  : " +b.getjari());
        b.LuasPermukaan("Luas Permukaan Bola : " +b.getLuasPermukaan());
        b.Volume("Volume Bola : " +b.getVolume());
    }
}