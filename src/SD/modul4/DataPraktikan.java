package SD.modul4;
import java.util.HashMap;
import java.util.Scanner;

public class DataPraktikan {
    HashMap<String, String> dataTabel = new HashMap<>();
    HashMap<String, String> tabelSesiLogin = new HashMap<>();
    Scanner input = new Scanner(System.in);

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (!dataTabel.containsKey(nimPraktikan)) {
            if (nimPraktikan.contains("IF")) {
                dataTabel.put(nimPraktikan, namaAsisten);
            } else {
                System.out.println("Format NIM Salah!");
            }
        } else {
            System.out.println("Data Praktikan Sudah Ada");
        }
        return !dataTabel.containsKey(nimPraktikan);
    }

    public void tampil() {
        System.out.println("Total Data Praktikan Yang Tersimpan : " + dataTabel.size());
        String[] nim = dataTabel.keySet().toArray(new String[0]);
        String[] asisten = dataTabel.values().toArray(new String[0]);

        for (int i = 0; i < dataTabel.size(); i++) {
            System.out.println("NIM : " + nim[i] + "\t\t" + "Nama Asisten : " + asisten[i]);
        }
    }

    public void listNimPraktikan() {
        System.out.println(dataTabel.keySet());
    }

    public void listNamaAsisten() {
        System.out.println(dataTabel.values());
    }

    public int total() {
        return dataTabel.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (dataTabel.containsKey(nimPraktikan)) {
            dataTabel.remove(nimPraktikan, namaAsisten);
        } else {
            System.out.println("Data Praktikan Tidak Ditemukan!");
        }
        return true;
    }

    public boolean editData(String nimPraktikan, String namaAsisten) {
        for (String nim : dataTabel.keySet()) {
            if (nim.equals(nimPraktikan)) {
                System.out.println("Data Praktikan Lama Yang Diedit NIM : " + nimPraktikan) ;
                System.out.println("Nama Asisten : " + namaAsisten);
                System.out.print("Masukkan Nama Asisten Yang Baru : ");
                String namaBaru = input.next();
                dataTabel.replace(nimPraktikan, namaBaru);
            } else {
                System.out.println("Data Praktikan Tidak Ditemukan!");
            }
            return true;
        }
        return false;
    }

    public void search(String namaAsisten) {
        int i = 1;
        System.out.println("List NIM Dengan Asisten " + namaAsisten + " : ");
        for (String key : dataTabel.keySet()) {
            if (dataTabel.get(key).equals(namaAsisten)) {                System.out.println(i + ". " + key);
                i++;
            }
        }
    }

    public void login() {
        tabelSesiLogin.put("kristin@umm.ac.id", "123");
        System.out.println("             LOGIN");
        System.out.print("Silahkan Masukkan Email : ");
        String email = input.next();
        if (tabelSesiLogin.containsKey(email)) {
            if (email.contains("@umm.ac.id")) {
                System.out.print("Masukkan Password : ");
                String password = input.next();
                if (tabelSesiLogin.containsValue(password)) {
                    System.out.println("Login Sukses");
                    while (true) {
                        System.out.println(
                                "\n             MENU" +
                                        "\n1. Tambah Data" +
                                        "\n2. Tampilkan Data" +
                                        "\n3. Tampilkan List NIM Praktikan" +
                                        "\n4. Tampilkan List Nama Asisten" +
                                        "\n5. Total Jumlah Data" +
                                        "\n6. Hapus Data" +
                                        "\n7. Edit Data" +
                                        "\n8. Cari Data" +
                                        "\n9. Logout");


                        System.out.print("Silahkan Masukkan Pilihan : ");
                        int pilih = input.nextInt();
                        switch (pilih) {
                            case 1:
                                System.out.println("       TAMBAH DATA BARU");
                                System.out.print("Masukkan NIM : ");
                                String nim = input.next();
                                System.out.print("Masukkan Nama Asisten : ");
                                String namaA = input.next();
                                tambahData(nim, namaA);
                                break;
                            case 2:
                                tampil();
                                break;
                            case 3:
                                listNimPraktikan();
                                break;
                            case 4:
                                listNamaAsisten();
                                break;
                            case 5:
                                System.out.println(total());
                                break;
                            case 6:
                                System.out.println("          HAPUS DATA");
                                System.out.print("Masukkan NIM : ");
                                String nimHapus = input.next();
                                System.out.print("Masukkan Nama Asisten : ");
                                String namaHapus = input.next();
                                hapusData(nimHapus, namaHapus);
                                break;
                            case 7:
                                System.out.println("           EDIT DATA");
                                System.out.print("Masukkan NIM : ");
                                String nimEdit = input.next();
                                System.out.print("Nama Asisten Lama : ");
                                String namaEdit = input.next();
                                editData(nimEdit, namaEdit);
                                break;
                            case 8:
                                System.out.println("      SEARCH DATA ASISTEN");
                                System.out.print("Masukkan Nama Asisten : ");
                                String namaAsisten = input.next();
                                search(namaAsisten);
                                break;
                            case 9:
                                logout();
                        }

                    }

                } else {
                    System.out.println("Gagal Login");
                    login();
                }
            }

        } else {
            System.out.println("Gagal Login, Email Salah!");
            login();
        }
    }

    public void logout() {
        System.out.println("             LOGOUT");
        System.exit(0);
    }

    public static void main(String[] args) {
        DataPraktikan dp = new DataPraktikan();
        dp.login();
    }
}