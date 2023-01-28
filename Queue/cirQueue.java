package Queue;

public class cirQueue {

    int queue[] = new int[5];
    int front = -1;
    int rear = -1;

    public void add (int data) {
        if (isEmpty()) {
            rear++;
            front++;
            queue[rear] = data;
        } else if ((rear + 1) % 5 == front) {
            System.out.println("List is full");
        } else {
            rear = (rear + 1) % 5;
            queue[rear] = data;
        }
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (front == rear) {
            System.out.println("pop element is " + queue[front]);
            front = rear = -1;
        } else {
            System.out.println("pop element is " + queue[front]);
            front = (front + 1) % 5;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");

        } else {
            int temp = front;
            System.out.println(queue[temp]);
            do {
                {

                    temp = (temp + 1) % 5;
                    System.out.println(queue[temp]);
                }
            } while (temp != rear);

        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("peek element is " + queue[front]);
        }
    }

    public boolean isEmpty()
    {
        return rear ==-1 && front == -1;
    }

    public static void main(String[] args) {

        cirQueue q = new cirQueue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        q.remove();

        q.add(77);
        q.add(100);
        q.add(6);

        q.remove();
        q.peek();
        q.display();

    }
}
