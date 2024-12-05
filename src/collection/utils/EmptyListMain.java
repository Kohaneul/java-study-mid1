package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();  //자바5
        System.out.println("list3.getClass() = " + list3.getClass());
        List<Integer> list4 = List.of();
        System.out.println("list4.getClass() = " + list4.getClass());
        Integer[] arr = {1,2,3};
        List<Integer> arrList = Arrays.asList(arr);
        arrList.set(2,3000);//참조값을 그대로 가져다 쓰기 떄문에 Integer[] 값이 변함 >> 배열의 크기가 클 경우 이 방법이 더 나음
        System.out.println("arrList = " + arrList);
        System.out.println("arr = " + arr);
        List<Integer> arr1 = List.of(arr); //새로운 arr을 만듦 (이걸 추천함)
        System.out.println("arr1 = " + arrList);
    }
}
