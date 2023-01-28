
public class LinkedList {

    Node head;
    int size;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }

    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null ");

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;

        }
        size++;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

        }
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");

        } else {
            head = head.next;
        }
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        Node prev = head;
        if (head == null) {
            System.out.println("Linkedlist is empty");
        } else {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
        size--;
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("invalil index");
        } else if (index == 0) {
            addFirst(data);
            return;
        } else if (index == size) {
            addLast(data);
        }

        else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.display();

        ll.add(4, 40);

        ll.display();
    }
}