package collection.set.test;

import java.util.*;

public class UniqueNameTest2 {


    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        Set<Integer> inputSet = new LinkedHashSet<>(List.of(inputArr));
        System.out.println("inputSet = " + inputSet);

    }
}
