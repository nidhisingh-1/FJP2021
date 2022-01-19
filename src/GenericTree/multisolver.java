//package GenericTree;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Queue;
//import java.util.Stack;
//
//public class multisolver {
//
//    private static class Node {
//        int data;
//        ArrayList<Node> children = new ArrayList<>();
//    }
//
//    public static void display(Node node) {
//        String str = node.data + " -> ";
//        for (Node child : node.children) {
//            str += child.data + ", ";
//        }
//        str += ".";
//        System.out.println(str);
//
//        for (Node child : node.children) {
//            display(child);
//        }
//    }
//
//    public static Node construct(int[] arr) {
//        Node root = null;
//
//        Stack<Node> st = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == -1) {
//                st.pop();
//            } else {
//                Node t = new Node();
//                t.data = arr[i];
//
//                if (st.size() > 0) {
//                    st.peek().children.add(t);
//                } else {
//                    root = t;
//                }
//
//                st.push(t);
//            }
//        }
//
//        return root;
//    }
//
//    static int sum = 0;
//    static int max = Integer.MIN_VALUE;
//    static int min = Integer.MAX_VALUE;
//    static int height = -1;
//
//    public static void multiSolver(Node node, int depth){
//        // every node will come here
//        sum += node.data;
//        if(node.data > max){
//            max = node.data;
//        }
//        if(node.data < min){
//            min = node.data;
//        }
//        if(depth > height){
//            height = depth;
//        }
//
//        for(Node child: node.children){
//            multiSolver(child, depth + 1);
//        }
//    }
//
//    public static class HeapMover {
//        int sum = 0;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        int height = -1;
//    }
//
//    public static void multiSolver2(Node node, int depth, HeapMover mover){
//        // every node will come here
//        mover.sum += node.data;
//        if(node.data > mover.max){
//            mover.max = node.data;
//        }
//        if(node.data < mover.min){
//            mover.min = node.data;
//        }
//        if(depth > mover.height){
//            mover.height = depth;
//        }
//
//        for(Node child: node.children){
//            multiSolver2(child, depth + 1, mover);
//        }
//    }
//
//    static int largest = Integer.MIN_VALUE;
//    static int slargest = Integer.MIN_VALUE;
//    public static void secondLargest(Node node){
//        if(node.data >= largest){
//            slargest = largest;
//            largest = node.data;
//        } else if(node.data > slargest){
//            slargest = node.data;
//        }
//
//        for(Node child: node.children){
//            secondLargest(child);
//        }
//    }
//
//    static class MoverForSlargest {
//        int largest = Integer.MIN_VALUE;
//        int slargest = Integer.MIN_VALUE;
//    }
//
//    public static void slargest2(Node node, MoverForSlargest mover){
//        if(node.data >= mover.largest){
//            mover.slargest = mover.largest;
//            mover.largest = node.data;
//        } else if(node.data > mover.slargest){
//            mover.slargest = node.data;
//        }
//
//        for(Node child: node.children){
//            slargest2(child, mover);
//        }
//    }
//
//    static int ceil = Integer.MAX_VALUE; // because it is a min (of the larger elements)
//    static int floor = Integer.MIN_VALUE; // because it is a max (of the smaller elements)
//    public static void ceilAndFloor1(Node node, int data){
//        if(node.data > data){
//            // valid for ceil
//            if(node.data < ceil){
//                ceil = node.data;
//            }
//        }
//
//        if(node.data < data){
//            // relevant for floor
//
//            if(node.data > floor){
//                floor = node.data;
//            }
//        }
//
//        for(Node child: node.children){
//            ceilAndFloor1(child, data);
//        }
//    }
//
//    static class CFMover {
//        int ceil = Integer.MAX_VALUE;
//        int floor = Integer.MIN_VALUE;
//    }
//
//    public static void ceilAndFloor2(Node node, int data, CFMover cfmover){
//        if(node.data > data){
//            // valid for ceil
//            if(node.data < cfmover.ceil){
//                cfmover.ceil = node.data;
//            }
//        }
//
//        if(node.data < data){
//            // relevant for floor
//
//            if(node.data > cfmover.floor){
//                cfmover.floor = node.data;
//            }
//        }
//
//        for(Node child: node.children){
//            ceilAndFloor2(child, data, cfmover);
//        }
//    }
//
//
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        String[] values = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(values[i]);
//        }
//
//        Node root = construct(arr);
//        secondLargest(root);
//        System.out.println(largest + " " + slargest);
//
//        MoverForSlargest mover = new MoverForSlargest();
//        slargest2(root, mover);
//        System.out.println(mover.largest + " " + mover.slargest);
//
//
//        // int d = Integer.parseInt(br.readLine());
//        // ceilAndFloor1(root, d);
//        // System.out.println("Ceil = " + ceil);
//        // System.out.println("Floor = " + floor);
//
//        int k1 = Integer.parseInt(br.readLine());
//        int k1thLargest = Integer.MAX_VALUE;
//        for(int i = 0; i < k; i++){
//            ceilAndFloor1(root, k1thLargest);
//            k1thLargest = floor;
//            floor = Integer.MIN_VALUE; // this line is important
//        }
//
//        int k2 = Integer.parseInt(br.readLine());
//        int k2thLargest = Integer.MAX_VALUE;
//        //?
//        for(int i = 0; i < k; i++){
//            ceilAndFloor1(root, k2thLargest);
//            k2thLargest = floor;
//            floor = Integer.MIN_VALUE; // this line is important
//        }
//
//        for(int i = 0; i < k; i++){
//            CFMover cfmover = new CFMover();
//            ceilAndFloor2(root, kthLargest, mover);
//            kthLargest = mover.floor;
//        }
//
//        System.out.println(k + "th Largest = " + kthLargest);
//    }
//
//}
