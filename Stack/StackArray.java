package Stack;

import java.util.ArrayList;

public class StackArray {

    ArrayList<Integer> list = new ArrayList<>();
    private int top = -1;

    public void push(int data) {
        top++;
        list.add(data);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("This item is removed in the stack  " + list.remove(top));
            top--;
        }
    }

    public void peek() {
        System.out.println(list.get(top));
    }

    public void display() {
        int temp = top;

        while (temp >= 0) {

            System.out.println(list.get(temp));
            temp--;
        }
    }

    public static void main(String[] args) {

        StackArray s = new StackArray();

        s.push(1);
        s.push(2);
        s.push(3);

        s.display();

        s.pop();
        s.pop();

        s.peek();

        s.display();

    }

}
