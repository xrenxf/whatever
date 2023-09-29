package PBO.modul2;
import java.util.Scanner;

public class belahketupat {
    Scanner in = new Scanner(System.in);

    String menu;
    int d1, d2;
    double luas, keliling;
    boolean lanjutkan = true;

    int getd1(){return d1;}
    int getd2(){return d2;}

    public void luaskeliling() {
        System.out.println("Kalkulator Menghitung Keliling / Luas Belah Ketupat");
        System.out.println("\t\t\t MENU");
        System.out.println("========================================");
        System.out.println("1. Menghitung Keliling Belah Ketupat");
        System.out.println("2. Menghitung Luas Belah Ketupat");
        System.out.println("3. Exit");

        while (lanjutkan){
            System.out.println("Pilih Menu : ");
            menu = in.next();

            switch(menu){
                case "1" :
                    System.out.println("Masukan nilai diagonal 1 : ");
                    d1 = in.nextInt();
                    System.out.println("Masukan nilai diagonal 2 : ");
                    d2 = in.nextInt();
                    keliling = (d1 + d2) * 2;
                    System.out.println("Diagonal 1 : " + getd1());
                    System.out.println("Diagonal 2 : " + getd2());
                    System.out.println("Keliling Belah Ketupat : " + keliling);
                    break;

                case "2" :
                    System.out.println("Masukan nilai diagonal 1 : ");
                    d1 = in.nextInt();
                    System.out.println("Masukan nilai diagonal 2 : ");
                    d2 = in.nextInt();
                    luas = d1 * d2 * 0.5;
                    System.out.println("Diagonal 1 : " + getd1());
                    System.out.println("Diagonal 2 : " + getd2());
                    System.out.println("luas Belah Ketupat : " + luas);
                    break;

                case "3" :
                    System.exit(0);
                    break;

                default:
                    System.err.println("Please Select Menu No 1, 2 or 3");
            }
            System.out.println("Apakah anda ingin melanjutkan (y/n)? ");
            menu = in.next();
            lanjutkan = menu.equalsIgnoreCase("y");
        }

    }

    public static void main(String[] args){
        belahketupat c = new belahketupat();
        c.luaskeliling();
    }

}