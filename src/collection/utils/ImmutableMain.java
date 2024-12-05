package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);//불변객체
        System.out.println("integers = " + integers);
        //불변 - > 가변
       List<Integer> mutableList = new ArrayList<>(integers);

        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList class = " + mutableList.getClass());

        //가변 -> 불변
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList = " + unmodifiableList.getClass());
//        unmodifiableList.add(1);    //예외 발생

    }
}
