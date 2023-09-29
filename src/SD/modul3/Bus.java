package SD.modul3;
import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue Q = new Queue();
        int pilih = 0;

        while (true) {
            System.out.println("\nAntrian Pemberangkatan Bis:");
            System.out.println("1. Tambah Antrian bis ");
            System.out.println("2. Berangkatkan Bis");
            System.out.println("3. Tampilkan Bis Terdepan pada antrian");
            System.out.println("4. Cek apakah antrian kosong");
            System.out.println("5. Lihat jumlah bis pada antrian");
            System.out.println("6. Tampilkan Seluruh Antrian ");
            System.out.println("7. Keluar dari program");
            System.out.print("Pilihan Anda: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Bis: ");
                    String namabis = sc.next();
                    System.out.print("Masukkan Tujuan: ");
                    String tujuan = sc.next();
                    DataAntrian tiket = new DataAntrian(namabis, tujuan);
                    Q.enqueue(tiket);
                    break;
                case 2:
                    Q.dequeue();
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    if (Q.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 5:
                    System.out.println("Jumlah antrian : " + Q.size());
                    break;
                case 6:
                    Q.view();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
//merepresentasikan data bis yang di antrikan pd program tiketbus
class DataAntrian {
    String namabis, tujuan;
    public DataAntrian(String namabis, String tujuan) {
        this.namabis = namabis;
        this.tujuan = tujuan;
    }
    public void displayTiket() {
        System.out.println("Bis : " + namabis + " dengan tujuan " + tujuan);
    }
}
//tmpt berisi objek dr dta antrian
class Node {
    DataAntrian data;
    Node next;
    public Node(DataAntrian data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node first, last;
    int size;
    public Queue() {
        this.size = 0;
    }
    //menmabah data
    public void enqueue(DataAntrian data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
        System.out.println("Bis : " + data.namabis + ", Dengan tujuan : " + data.tujuan + " telah ditambahkan pada antrian.");
    }
    //hapus data / mengeluarkan elemen pertama
    public void dequeue() {
        if (first==null) {
            System.out.println("Tidak ada data.");
        } else {
            DataAntrian data = first.data;
            first = first.next;
            //antrian kosong
            if (first == null) {
                last = null;
            }
            size--;
            System.out.println("Bis  " + data.namabis + " telah berangkat.");
        }
    }
    //memeriksa data pada antrian
    public void peek() {
        if (isEmpty()) {
            System.out.println("Tidak ada bis yang akan berangkat.");
        } else {
            System.out.println("Bis dengan antrian terdepan : " + first.data.namabis);
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        return size;
    }

    public void view() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Node current = first;
            System.out.println("Bis yang ada dalam antrian: ");
            while (current != null) {
                current.data.displayTiket();
                current = current.next;
            }
        }
    }
}