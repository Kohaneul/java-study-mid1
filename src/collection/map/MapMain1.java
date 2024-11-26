package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA",90);
        studentMap.put("studentB",80);
        studentMap.put("studentC",80);
        studentMap.put("studentD",100);
        System.out.println("studentMap = " + studentMap);

        //특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("KeySet 활용");
        for (String key : studentMap.keySet()) {
            System.out.println(key+" : "+studentMap.get(key));
        }
        System.out.println("value 활용");

        for (Integer value : studentMap.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("entrySet 활용");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" = " + value);
        }


    }
}
