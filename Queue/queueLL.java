package Queue;

public class queueLL {

    Node front = null;
    Node rear = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {
        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void peek() {
        if (front == null && rear == null) {
            System.out.println("list is empty");
        } else {
            System.out.println(front.data + " is peek element");
        }
    }

    public void remove() {
        if (front == null && rear == null) {
            System.out.println("List is empty");
        } else if (front == rear) {
            System.out.println("pop element is (Last element)" + front.data);
            front = rear = null;
        } else {
            System.out.println("pop element is " + front.data);
            front = front.next;
        }
    }

    public static void main(String[] args) {

        queueLL q = new queueLL();

        q.add(1);
        q.add(5);
        q.add(5);
        q.add(5);
        q.add(5);
        q.add(5);
        q.add(5);

        q.display();

        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.display();
        q.peek();
    }

}
