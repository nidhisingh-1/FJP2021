package Stack;
import java.util.*;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); // push pop peak all are 0(1)

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
