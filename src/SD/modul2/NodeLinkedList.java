package SD.modul2;

public class NodeLinkedList {
    //LinkedList : sama kaya ArrayList perbedaan cara menyimpan data
    //SingleList : memiliki node data berikutnya dan data itu sendiri
    //DoubleList : memiliki 3 field (1 prev, 1 nxt, 1 data tersebut)
    //Circular : single (next menunjuk dirinya sendiri), double (next & prev menunjuk node itu sendiri)

    class Node {
        int data;

        Node next, prev;
        public Node(int data){
            this.data=data;
        }
    }
    //Node sebagai penyimpanan data (memory)

    Node first, last;
    public void addData(int dataBaru ){
        Node nodeBaru = new Node(dataBaru);

        if (first == null) { //jika node masih kosong
            first = last = nodeBaru;
        } else {
            last.next = nodeBaru;
            nodeBaru.prev = last;
            last = nodeBaru;
        }
    }
    //Membandingkan Node yang sudah ada dengan yang sebelumnya

    public void NodeLinkedList() {
        Node current = (Node) first, index;
        int temp;

        while (current != null) {
            index = current.next;

            while (index != null) {

                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                    //temp berhenti sorting dengan urutan terbesar dan terkecil
                }
                index = index.next;
            }
            current = current.next;
            //nilai tidak bisa dibandingkan lagi dna sudah selesai
        }
    }
    //Line 29 - 47 untuk mengurutkan data

    public void printAll() {
        Node current = (Node) first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
            //untuk menampilkan nilai before dan after
        }
    }

    public static void main(String[] args) {
        NodeLinkedList sortLL = new NodeLinkedList();

        sortLL.addData(8);
        sortLL.addData(7);
        sortLL.addData(1);
        sortLL.addData(4);
        sortLL.addData(6);
        sortLL.addData(2);
        sortLL.addData(3);
        //Nilai N
        System.out.print("Before : ");
        sortLL.printAll();
        sortLL.NodeLinkedList();
        System.out.print("\nAfter : ");
        sortLL.printAll();

    }
}