package GenericTree;

import java.io.*;
import java.util.*;

public class iterative {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static class Pair{
        int state = -1;
        Node node;
    }
    public static void IterativePreandPostOrder(Node node) {
        // write your code here
        Stack<Pair> stack = new Stack<>();
        Pair rootp = new Pair();
        rootp.state = -1;
        rootp.node = node;
        stack.push(rootp);

        String Preorder = "";
        String Postorder = "";

        while(stack.size() > 0){
            Pair peekp = stack.peek();

            if(peekp.state == -1){
                Preorder += peekp.node.data;
                rootp.state++;
            } else if(peekp.state >= 0 && peekp.state < node.children.size()-1){
                Pair childp = new Pair();
                childp.state = -1;
                childp.node = peekp.node.children.get(peekp.state);
                stack.push(childp);
            } else if( peekp.state == peekp.node.children.size()){
                Postorder += peekp.node.data;
                peekp.state++;
            } else{
                stack.pop();
            }
        }

        System.out.println(Preorder + " ");
        System.out.println(Postorder + " ");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        IterativePreandPostOrder(root);
    }

}