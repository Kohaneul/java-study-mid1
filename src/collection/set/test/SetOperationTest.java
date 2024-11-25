package collection.set.test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SetOperationTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);  //교집합
        intersection.retainAll(set2); //retainAll : 겹치는 애만 남기고 나머지 다 없앰

        Set<Integer> difference = new HashSet<>(set1);  //교집합
        difference.removeAll(set2); //set1에 set2와 동일한 값 없앰

        System.out.println("합집합 = " + union);
        System.out.println("교집합 = " + intersection);
        System.out.println("차집합 = " + difference);




    }
}
