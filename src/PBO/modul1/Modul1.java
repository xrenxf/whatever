package PBO.modul1;
import java.util.Scanner;

public class Modul1 {
    Scanner in = new Scanner(System.in);

    private String Nama;
    private String NIM;
    private String Password;

    protected String getNama() {
        return Nama;
    }
    protected String getNIM() {
        return NIM;
    }
    protected String getPassword(){
        return Password;
    }

    public void setNIM(String NIM) {
        if (getNIM().length()!= 15) {
            System.out.println("NIM Harus Bejumlah 15 Angka");
        } else {
            this.NIM = NIM;
        }
    }
    public void setPassword(String Password){
        if (getPassword(). length()< 8) {
            System.out.println("Password Minimal 8 Karakter");
        } else {
            this.Password = Password;
        }
    }
    public void daftar() {

        System.out.println("=== DAFTAR ===");
        System.out.print("Nama : ");
        Nama=in.nextLine();
        do {
            System.out.print("NIM: ");
            NIM = in.next();
            setNIM (NIM);
        } while (getNIM().length() !=15);
        do {
            System.out.print("Password : ");
            Password = in.next();
            setPassword (Password);
        }while (getPassword(). length() <8);


        System.out.println("=====================================");
        System.out.println("Selamat " + getNama() + " Anda berhasil daftar ");
        System.out.println();
        System.out.println("Berikut Username beserta Password Anda : ");
        System.out.println("Username : " + getNIM());
        System.out.println("Password : " + getPassword());
        System.out.println("=====================================");
    }
    public static void main(String[] args) {
        Modul1 c = new Modul1();
        c.daftar();
    }
}