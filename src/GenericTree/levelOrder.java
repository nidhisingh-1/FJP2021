package GenericTree;

import java.util.*;

public class levelOrder {

    public static class Node {
        int data;
        ArrayList<Node> gt = new ArrayList<Node>();

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

        Node root = new Node(10);
        Node twenty = new Node(20);
        root.gt.add(twenty);
        Node thirty = new Node(30);
        root.gt.add(thirty);
        Node forty = new Node(40);
        root.gt.add(forty);
        Node fifty = new Node(50);
        Node sixty = new Node(60);
        twenty.gt.add(fifty);
        twenty.gt.add(sixty);
        Node seventy = new Node(170);
        Node eighty = new Node(80);
        Node ninety = new Node(90);
        thirty.gt.add(seventy);
        thirty.gt.add(eighty);
        thirty.gt.add(ninety);
        Node hundred = new Node(100);
        forty.gt.add(hundred);
        Node oneTen = new Node(110);
        Node oneTwenty = new Node(120);
        eighty.gt.add(oneTen);
        eighty.gt.add(oneTwenty);

        levelOrder(root);
        System.out.println(size(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }

    public static void levelOrder(Node root) { // remove print add rpa algo

        Queue<Node> qt = new ArrayDeque<>();
        qt.add(root);

        while (qt.size() > 0) {
            Node temp = qt.remove();
            System.out.print(temp.data + " ");

            qt.addAll(temp.gt);

        }

        System.out.println(".");

    }

    public static int size(Node root) {

        int size = 0;

        for (Node child : root.gt) {
            size += size(child);
        }

        return size + 1;
    }

    public static int max(Node root) {
        int maxChild = root.data;

        for (Node child : root.gt) {
            int recAns = max(child);
            maxChild = Math.max(recAns, maxChild);
        }

        return maxChild;
    }

    public static int height(Node root){
        int height = -1;

        for(Node child : root.gt){
              int recAns = height(child);
              height = Math.max(recAns, height);
        }

        return height + 1;
    }
}

