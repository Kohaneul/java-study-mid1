package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list = " + list);
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        //첫번째 작업이 끝날때까지 기다ㅈㅇ
        System.out.println("synchronizedList = " + synchronizedList);
    }
}
