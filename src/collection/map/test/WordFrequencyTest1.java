package collection.map.test;

import java.util.*;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] split = text.split(" ");
        Map<String,Integer> resultMap = new HashMap<>();

        for (String s : split) {
            resultMap.put(s,resultMap.getOrDefault(s,0)+1);
        }
        System.out.println("resultSet = " + resultMap);

    }
}
