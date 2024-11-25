package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest1 {


    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

        Set<Integer> inputSet = new HashSet<>(List.of(inputArr));
        System.out.println("inputSet = " + inputSet);

    }
}
