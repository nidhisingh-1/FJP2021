package Heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HeapDemo {

    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            // write your code here
            data.add(val);
            upHeapify(data.size() -1);
        }

        private void upHeapify(int i) {
            if(i == 0){
                return;
            }

            int p = (i-1)/2;
            if(data.get(p) > data.get(i)){
                swap(p, i);
            }
        }

        private void swap(int i, int j) {
            int ith = data.get(i);
            int jth = data.get(j);
            data.set(i, jth);
            data.set(j, ith);

        }

        public int remove() {
            // write your code here
            if(data.size() == 0){
                System.out.println("Underflow");
                return -1;
            }

            swap(0, data.size()-1);
            int val = data.remove(data.size()-1);
            downHeapify(0);
            return val;
        }

        private void downHeapify(int i) {
            int mini = i;

            int lci = 2*i + 1;
            if(lci < data.size() && data.get(lci) < data.get(mini)){
                mini = lci;
            }

            int rci = 2*i + 2;
            if(rci < data.size() && data.get(rci) < data.get(mini)){
                mini = rci;
            }

            if(mini != i){
                swap(i, mini);
                downHeapify(mini);
            }
        }

        public int peek() {
            // write your code here
            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}
