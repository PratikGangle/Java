public class CircleLL {
    Node head;
    Node tail;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
        } else {

            Node temp = head;

            do {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            } while (temp != head);

        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;

        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    public void add(int data, int index) {
        Node newNode = new Node(data);

        if (index < 0 || index > size) {
            System.out.println("invail index");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            tail.next = head.next;
            head = head.next;
        }
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = head;

            tail = temp;
        }
        size--;
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("List is empty");
        } else if (index == 0) {
            deleteFirst();
        } else if (index == size) {
            deleteLast();
        } else if (index < 0 || index > size) {
            System.out.println("invail index");
        } else {
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void displays() // display using tail
    {
        Node temp = tail;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != tail);
    }

    public static void main(String[] args) {

        CircleLL ll = new CircleLL();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);

        ll.display();
        System.out.println();
        ll.remove(6);
        ll.display();

        System.out.println();
        // ll.displays();
    }

}
