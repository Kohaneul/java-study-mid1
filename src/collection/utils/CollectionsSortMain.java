package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        System.out.println("max = " + max);
        Integer min = Collections.min(list);
        System.out.println("min = " + min);

        System.out.println("list = "+list);

        Collections.shuffle(list);  //랜덤하게 list요소를 섞는다
        System.out.println("shuffle list = "+list);

        Collections.sort(list); //list.sort 쓰는걸 추천
        System.out.println("list = "+list);

        Collections.reverse(list);
        System.out.println("reverse list = "+list);


    }
}
