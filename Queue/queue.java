package Queue;

public class queue {

    int queue[] = new int[5];
    int front = -1;
    int rear = -1;

    public void add(int data) {
        if (rear == 5 - 1) {
            System.out.println("list is full");
        } else if (front == -1 && rear == -1) {
            rear++;
            front++;
            queue[rear] = data;

        } else {
            rear++;
            queue[rear] = data;
        }
    }

    public void remove() {
        if (front == -1 && rear == -1) {
            System.out.println("list is empty");
        } else if (front == rear) {
            System.out.println("pop element is " + queue[front]);
            front = rear = -1;
        } else {
            System.out.println("pop element is " + queue[front]);
            front++;
        }
    }

    public void peek() {
        if (front == -1 && rear == -1) {
            System.out.println("list is empty");
        } else {
            System.out.println("peek value is " + queue[front]);
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("list is empty");
        } else {

            int i = front;

            while (i < rear + 1) {
                System.out.println(queue[i]);
                i++;
            }
        }
    }

    public static void main(String[] args) {

        queue q = new queue();

        

        q.add(6);
        q.add(66);
        q.add(7);

        q.remove();
        q.peek();

        q.display();

    }
}
