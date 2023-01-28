package Queue;
import java.util.*;


public class queueStack {

    static Stack <Integer>  s1 = new Stack<>();
    static Stack <Integer> s2  = new Stack<>();
    
    public static boolean isEmpty()
    {
        return s1.isEmpty();
    }


    public static void add(int data)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

    }

    public static int  remove()
    {
        if(s1.isEmpty())
        {
            System.out.println("List is empty");
            return -1;
        }
        else{
            return s1.pop();
        }
    }


    public static int peek()
    {
        if(s1.isEmpty())
        {
            System.out.println("List is empty");
            return -1;
        }
        else{
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        queueStack q = new queueStack();

        q.add(1);
        q.add(2);
        q.add(3);


        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }


        
    }
}