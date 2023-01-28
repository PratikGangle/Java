package Queue;

public class CirQueueLL {
    Node front=null;
    Node rear = null;

    class Node{
        int data;
        Node next;

        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public void push(int data)
    {
        Node newNode = new Node(data);
        if(front == null && rear == null)
        {
            front = rear = newNode;
            newNode.next = rear;            
        }
        else{
            newNode.next = front;
            rear.next = newNode;
            rear= newNode;
        }
    }

    public void pop ()
    {
        if(front == null && rear == null)
        {
            System.out.println( "List is empty");

        }
        else if (front == rear ){
            System.out.println("pop element is " + front.data);
        }
        else{
            System.out.println("Pop element is " + front.data);
            front = front.next;
        }
    }

    public void display()
    {
        if(front == null && rear == null)
        {
            System.out.println("List is empty");
        }
        else{
            Node temp = front;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            }
            while(temp != front);
        }
    }
    

    public static void main(String[] args) {

        CirQueueLL  q = new CirQueueLL();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);


        q.pop();
        q.pop();
        q.pop();
        q.pop();



        q.display();
        
    }
}
