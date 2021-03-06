package GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GTremoveLeaves {

    public static class Node {
        int data;
        ArrayList<Node> gt = new ArrayList<>();

        Node(int data) {
            this.data = data;
        }

    }


    public static void main(String[] args) {

        int [] arr = {10, 20, 50, -1, 50, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1 , -1, 40, 100, -1, -1, -1};
        Node root = gtConstruct(arr);
        remove(root);

    }

    public static void remove(Node node){

        for(int i = node.gt.size()-1 ; i >= 0 ; i--){
            Node children = node.gt.get(i);

            if(children.gt.size() == 0){
                node.gt.remove(i);
            }
        }

        for(Node child : node.gt){
            remove(child);
        }
    }

    public static Node gtConstruct(int [] arr){

        Node root = null;
        Stack<Node> stack = new Stack<>();

        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] != -1){
                Node node = new Node(arr[i]);
                stack.push(node);
            } else {
                Node node = stack.pop();

                if(stack.size() > 0){
                    Node parent = stack.peek();
                    parent.gt.add(node);
                } else {
                    root = node;
                }
            }


        }

        return root;

    }



}
