package PBO.modul5;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;

public class DinasPertanahan {
    String Alamat;
    int PanjangTanah, LuasTanah;

    public void setAlamat(String Alamat){this.Alamat = Alamat;}
    public void setPanjangTanah(int PanjangTanah){this.PanjangTanah = PanjangTanah;}
    public void setLuasTanah(int LuasTanah){this.LuasTanah = LuasTanah;}

    public static void main(String[] args) {
        char ulang;

        //import class DinasPertahanan
        DinasPertanahan a = new DinasPertanahan();
        //import scanner untuk input
        Scanner in = new Scanner(System.in);

        do {
            int menu;
            System.out.println("=== DATA DINAS PERTANAHAN ===");
            System.out.println("\t\t--- Menu ---");
            System.out.println("\t\t1. Input DataPraktikan");
            System.out.println("\t\t2. Read DataPraktikan");
            System.out.println("Pilih Menu : ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    try {
                        FileWriter fileWriter = new FileWriter("DataPraktikan.txt", true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                        String Alamat;
                        int PanjangTanah, LuasTanah;

                        System.out.println("Alamat : ");
                        Alamat = in.next();
                        a.setAlamat(Alamat);

                        System.out.println("Panjang Tanah : ");
                        PanjangTanah = in.nextInt();
                        a.setPanjangTanah(PanjangTanah);

                        System.out.println("Luas Tanah : ");
                        LuasTanah = in.nextInt();
                        a.setLuasTanah(LuasTanah);

                        String Data = String.format("Alamat : %s \nPanjang Tanah : %s meter \nLuas Tanah : %s meter\n\n", Alamat, PanjangTanah, LuasTanah);
                        bufferedWriter.write(Data);

                        bufferedWriter.close();
                    } catch (Exception e) {
                        System.out.println("DataPraktikan Yang Anda Masukan Tidak Sesuai");
                    } finally {
                        System.out.println("finally");
                    }
                    break;

                case 2:
                    try {
                        //Representasi lokasi file yang akan dibaca
                        FileReader fileReader = new FileReader("DataPraktikan.txt");

                        //Menggunakan try with resource statement
                        try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                            //Untuk mengambil baris data yang ada pada File
                            String Data;

                            //Menampilkan semua baris data didalam file contohFile.txt
                            while ((Data = bufferedReader.readLine()) != null) {
                                System.out.println(Data);
                            }
                        }
                    } catch(FileNotFoundException e){
                        //Menangani kesalahan jika file tersebut tidak ditemukan
                        System.out.println("File tidak ditemukan ");
                    }catch(Exception e){
                        //Menangani kesalahan jika file tersebut tidak dapat dibaca
                        System.out.println("File tidak dapat dibaca ");
                    } finally {
                        System.out.println("finally");
                    }
                    break;

                default:
                    System.out.println("Menu Tidak Tersedia");
            }
            System.out.println();
            System.out.print("next (y/n)? ");
            ulang = in.next().charAt(0);

        }while (ulang != 'n') ;

    }
}
/*exception untuk menangani error
setiap pernyataan yang dapat mengakibatkan exception harus berada pada try, untuk menangani munculnya kesalahan pada progran
catch unutk menangani jenis exception, kesalahan yang muncul akan dianggap sebagai objek
finnaly adalah statemen kalau data yang dimasukan di try itu benar
File Writer untuk input/menulis data pada file
File Reader umtuk membaca file yang tersimpan pada file
buffer untuk membaca sementara data yang telah diinput
 */