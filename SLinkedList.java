package P3P4_Tugas;


public class SLinkedList<E> {
    // Kelas Node bersarang
    private static class Node<E> {
        private E element; // referensi ke elemen yang disimpan di node ini
        private Node<E> next; // referensi ke node berikutnya dalam daftar

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public void setElement(E string) {
        }
    } // Kelas Node berakhir

    // Variabel instan dari SLinkedList
    private Node<E> head = null; // head node dari daftar (atau null jika kosong)
    private Node<E> tail = null; // node terakhir dari daftar (atau null jika kosong)
    private int size = 0; // jumlah node dalam daftar

    public SLinkedList() {
    } // membuat daftar kosong
      // metode akses

    public int size() {
        return size;
    } // mengembalikan ukuran dari daftar
    
    public boolean isEmpty() {
        return size == 0;
    } // mengembalikan true jika daftar kosong

    public E first() { // mengembalikan (tetapi tidak menghapus) elemen pertama
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last() { // mengembalikan (tetapi tidak menghapus) elemen terakhir
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    // metode pembaruan
    public void addFirst(E e) { // menambahkan elemen e ke depan daftar
        head = new Node<>(e, head); // membuat dan menghubungkan node baru
        if (size == 0)
            tail = head; // kasus khusus: node baru menjadi tail juga
        size++;
    }

    public void addLast(E e) { // menambahkan elemen e ke belakang daftar
        Node<E> newest = new Node<>(e, null); // node baru akan menjadi tail
        if (isEmpty())
            head = newest; // kasus khusus: jika daftar kosong
        else
            tail.setNext(newest); // node lama menjadi node sebelumnya
        tail = newest; // node baru menjadi tail
        size++;
    }

    public E removeFirst() { // menghapus dan mengembalikan elemen pertama
        if (isEmpty())
            return null; // tidak ada yang dapat dihapus
        E answer = head.getElement();
        head = head.getNext(); // menghapus head node
        size--;
        if (size == 0)
            tail = null; // kasus khusus: jika daftar kosong
        return answer;
    }

    public void removeLast() { // menghapus dan mengembalikan elemen terakhir
        if (isEmpty())
            return; // tidak ada yang dapat dihapus
        Node<E> temp = head;
        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }
        tail = temp;
        tail.setNext(null);
        size--;
    }

    public void setFirst(int i, String string) { // mengubah elemen pertama
        head.setElement((E) string);
    }

    public void setLast(int i, String string) { // mengubah elemen terakhir
        tail.setElement((E) string);
    }

    public void remove(int i) {
    }
} 