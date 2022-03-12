package BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BTdemo {

    public static class Node {
        int data;
        Node left;
        Node right;
    }

    public static class Pair {
        Node node;
        int state;
    }

    public static Node construct(Integer[] arr){
        Stack<Pair> stack = new Stack<>();

        Node root = new Node();
        root.data = arr[0];

        Pair rootp = new Pair();
        rootp.node = root;
        rootp.state = 1;

        stack.push(rootp);
        int idx = 1;

        while(stack.size() > 0){
            Pair peekp = stack.peek();

            if(peekp.state == 1){
                // left
                if(arr[idx] != null){
                    Node lc = new Node();
                    lc.data = arr[idx];
                    peekp.node.left = lc;

                    Pair lp = new Pair();
                    lp.node = lc;
                    lp.state = 1;

                    stack.push(lp);
                }
                peekp.state++;
                idx++;
            } else if(peekp.state == 2){
                // right
                if(arr[idx] != null){
                    Node rc = new Node();
                    rc.data = arr[idx];
                    peekp.node.right = rc;

                    Pair rp = new Pair();
                    rp.node = rc;
                    rp.state = 1;

                    stack.push(rp);
                }
                peekp.state++;
                idx++;
            } else if(peekp.state == 3){
                // pop
                stack.pop();
            }
        }

        return root;
    }

    public static void display(Node node){
        if(node == null){
            return;
        }

        String str = " <- " + node.data + " -> ";
        String lcstr = node.left == null? ".": node.left.data + "";
        String rcstr = node.right == null? ".": node.right.data + "";
        System.out.println(lcstr + str + rcstr);

        display(node.left); // will print the entire left tree
        display(node.right); // will print the entire right tree
    }

    public static int size(Node node) {
        if(node == null) return 0;

        int ls = size(node.left);
        int rs = size(node.right);

        return ls + rs + 1;

        // one line code.
        // return (node == null ? 0 : size(node.left) + size(node.right) + 1);
    }

    public static int sum(Node node) {
        if(node == null) return 0;

        int lsum = sum(node.left);
        int rsum = sum(node.right);

        return lsum + rsum + node.data;

        //One Line Code.
        // return (node == null ? 0 : sum(node.left) + sum(node.right) + node.data);

    }

    public static int max(Node node) {
        if(node == null) return Integer.MIN_VALUE;

        int lmax = max(node.left);
        int rmax = max(node.right);

        return Math.max(node.data,Math.max(lmax,rmax));

        // One Line Code.
        // return node == null ? Integer.MIN_VALUE : Math.max(node.data,Math.max(max(node.left),max(node.right)));

    }

    public static int height(Node node) {
        if(node == null) return -1;

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh,rh) + 1;

        // One Line Code.
        // return node == null ? -1 : Math.max(height(node.left),height(node.right)) + 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (!values[i].equals("n")) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);
        display(root);
    }
}
