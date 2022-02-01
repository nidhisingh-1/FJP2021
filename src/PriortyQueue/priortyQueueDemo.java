package PriortyQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class priortyQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(1);
        pq.add(90);
        pq.add(23);
        pq.add(11);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println("------------------");
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());
        rq.add(10);
        rq.add(1);
        rq.add(90);
        rq.add(23);
        System.out.println(rq);
        rq.remove();
        System.out.println(rq);
        int val = rq.peek();
        System.out.println(val);


    }
}
