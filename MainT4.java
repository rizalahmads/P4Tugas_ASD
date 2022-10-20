public class MainT4 { // Tugas 4 DoublyLinkedList
    public static void main(String[] args) {
        // buat list kosong
        DLinkedList list = new DLinkedList();

        // tambah data awal
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        // tambah data akhir
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        // cetak list awal dan akhir
        list.printFirstLast();
        list.printLastFirst();

        // hapus data 4
        list.remove(1);

        // cetak list akhir
        list.printLastFirst();

        // tambah data tengah
        list.add(2, 22);
        list.add(6, 66);

        // cetak list akhir dan awal
        list.printLastFirst();
        

    }
    
}
