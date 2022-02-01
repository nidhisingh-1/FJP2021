package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HMdemo {
    public static void main(String[] args) {

        HashMap<String, Integer> pmap = new HashMap<>();
        pmap.put("India", 130);
        pmap.put("China", 200);
        pmap.put("Aus", 50);
        pmap.put("Utopia", 0);

        System.out.println(pmap);
        pmap.put("Aus", 15);
        System.out.println(pmap);

        System.out.println(pmap.containsKey("India"));

        Set<String> keys = pmap.keySet();
        for(String key : keys){
            System.out.print(key + " ");
        }

    }
}
