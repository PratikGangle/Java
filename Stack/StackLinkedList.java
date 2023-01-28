package Stack;

public class StackLinkedList {
    Node top = null;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            top = top.next;
        }
    }

    public void peek() {
        System.out.println(" peek element of the stack is " + top.data);
    }

    public static void main(String[] args) {

        StackLinkedList s = new StackLinkedList();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.display();
        s.peek();
        System.out.println("after pop operation");
        s.pop();
        s.pop();

        s.display();
    }

}