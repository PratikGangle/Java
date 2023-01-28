public class doublyLL {

    Node head;
    Node tail;
    int size;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;

        }
        size++;
    }

    public void add(int index, int data) {
        Node temp = head;
        if (index < 0 || index > size) {
            System.out.println("invail index");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println(" list is empty");

        } else {
            head.next.prev = null;
            head = head.next;
        }

        size--;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            tail.prev.next = null;
            tail = tail.prev;
        }
        size--;
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invail index");
        } else if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteLast();
        } else {
            Node temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }

    }

    public static void main(String[] args) {

        doublyLL ll = new doublyLL();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.addFirst(4);
        ll.addFirst(5);

        ll.display();
        ll.delete(4);

        // ll.add(3, 9);
        // ll.add(4, 9);
        // ll.deleteFirst();
        // ll.display();
        // ll.deleteLast();

        ll.display();

        // System.out.println(ll.size);

    }
}