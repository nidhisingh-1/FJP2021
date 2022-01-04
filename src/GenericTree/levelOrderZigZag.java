package GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class levelOrderZigZag {

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
        Node seventy = new Node(70);
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

        levelOrderZZ(root);
    }

    public static void levelOrderZZ(Node root) { // remove print add rpa algo

        Queue<Node> qt = new ArrayDeque<>();
        Queue<Node> ans = new ArrayDeque<>();
        int level = 0;
        qt.add(root);

        while (qt.size() > 0) {
            Node temp = qt.remove();

            if(level%2 != 0){
                for(int i = temp.gt.size()-1 ; i >= 0 ; i--) {
                    System.out.print(temp.data + " ");
                }
            } else {
                for(int i = 0; i < temp.gt.size()-1 ; i++)
                System.out.print(temp.data + " ");
            }


            level++;
            ans.addAll(temp.gt);


            if (qt.size() == 0) {

                qt = ans;
                ans = new ArrayDeque<>();
                System.out.println(".");
            }

        }

    }
}
