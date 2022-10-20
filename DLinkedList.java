public class DLinkedList {
    // buat node
    Node head;
    Node tail;

    // buat kelas node
    public DLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    // cek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // tambah node di head
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // tambah node di akhir
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    // hapus node di head
    public Node removeFirst() {
        Node temp = head;
        if (head.next == null) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        return temp;
    }

    // hapus node di akhir
    public Node removeLast() {
        Node temp = tail;
        if (head.next == null) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        return temp;
    }

    // tambah node di tengah
    public boolean add(int key, int data) {
        Node current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node(data);
        if (current == tail) {
            newNode.next = null;
            tail = newNode;
        } else {
            newNode.next = current.next;
            current.next.prev = newNode;
        }
        newNode.prev = current;
        current.next = newNode;
        return true;
    }

    // hapus node di tengah
    public Node remove(int key) {
        Node current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == head) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current == tail) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        return current;
    }

    // hapus node kunci
    public void removeKey(int key) {
        Node current = head;
        while (current.data != key) {
            current = current.next;
            if (current == null)
                return;
        }
        if (current == head)
            head = current.next;
        else
            current.prev.next = current.next;
        if (current == tail)
            tail = current.next.prev;
        else
            current.next.prev = current.prev;
        return;
    }

    // cetak list awal ke akhir
    public void printFirstLast() {
        System.out.println("\nList (first --> last): " );
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }

    // cetak list akhir ke awal
    public void printLastFirst() {
        System.out.println("\nList (last --> first): ");
        Node current = tail;
        while (current != null) {
            current.displayNode();
            current = current.prev;
        }
        System.out.println("");
    }

}
