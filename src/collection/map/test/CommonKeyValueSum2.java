package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String,Integer> map1 =Map.of("A",1,"B",2,"C",3);

        Map<String,Integer> map2 =Map.of("B",4,"C",5,"D",6);

        Map<String,Integer> valueMap = new HashMap<>();
        for (String s : map1.keySet()) {
            if(map2.containsKey(s)){
                valueMap.put(s,map2.get(s));
            }
        }
        int sum = valueMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("valueMap.keySet() = " + valueMap.keySet());

        System.out.println("sum = " + sum);

    }
}
