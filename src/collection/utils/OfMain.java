package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 클래스 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        System.out.println("list class = "+list.getClass());
        System.out.println("map class = "+map.getClass());
        System.out.println("set class = "+set.getClass());

//        list.add(1) //불변 객체 > 예외 터짐

    }
}
