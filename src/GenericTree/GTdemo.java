package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GTdemo {

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

        Scanner scn = new Scanner(System.in);
        int item = scn.nextInt();
        // System.out.println(find(root, item));
        System.out.println(nodeToRootPath(root,item));

    }

    public static boolean find(Node node, int item){

        boolean found ;
        if(node.data == item){
            return true;
        }

        for(Node child : node.gt){
            found = find(child, item);
            if(found){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int data){

        if(node.data == data){
            ArrayList<Integer> path = new ArrayList<>();
            path.add(node.data);
            return path;
        }

        for(Node child : node.gt){
            ArrayList<Integer> path = nodeToRootPath(child, data);
            if(path.size() > 0){
                path.add(node.data);
                return path;
            }
        }
        return new ArrayList<>();
    }
}
