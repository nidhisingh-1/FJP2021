package BinaryTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class diameter {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    static int dia = 0;
    public static int diameter1(Node node) {
        // write your code here

        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);
        int ht = Math.max(lh,rh) + 1;

        if(lh + rh + 2 > dia){
            dia = lh + rh + 2;
        }

        return ht;
    }

    static class diaMover {
        int dia = 0;
    }

    public static int diameter2(Node node, diaMover dm){
        if(node == null){
            return -1;
        }

        int lh = diameter2(node.left, dm);
        int rh = diameter2(node.right, dm);
        int ht = Math.max(lh, rh) + 1;

        if(lh + rh + 2 > dm.dia){
            dm.dia = lh + rh + 2;
        }

        return ht;
    }

   static class diaPair{
        int ht = -1;
        int dia = 0;
   }
   public static diaPair diameter4(Node node){
        if(node == null){
            diaPair bp = new diaPair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }

        diaPair lp = diameter4(node.left);
        diaPair rp = diameter4(node.right);

        diaPair mp = new diaPair();
        mp.dia = Math.max(lp.ht + rp.ht + 2, Math.max(lp.dia,rp.dia));
        mp.ht = Math.max(lp.ht, rp.ht) + 1;

        return mp;
   }


    public static void main(String[] args) throws Exception {
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

      diaMover dia = new diaMover();
      diameter2(root, dia);
        System.out.println(dia.dia);
        System.out.println("------------------");
        System.out.println(diameter4(root).dia);

        //diapair is the best method.
    }

}
