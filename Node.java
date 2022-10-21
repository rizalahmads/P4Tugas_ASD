package P3P4_Tugas;

public class Node {
    // deklarasi variabel
    int data;
    Node next;
    Node prev;

    // buat konstruktor
    public Node(int data2) {
        this.data = data2;
    }

    // cetak data
    public void displayNode() {
        System.out.print("{" + data + "}");
    }
}
