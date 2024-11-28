package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> dictionaryMap  = new HashMap<>();
        initMap(dictionaryMap);
        Scanner sc = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요(종료는 'q') : ");
            String next = sc.next();

            if(next.equals("q")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("한글 뜻을 입력하세요 : "+dictionaryMap.getOrDefault(next,next+"은(는) 사전에 없는 단어입니다. "));
        }
    }

    static void initMap(Map<String,String> map){
        map.put("apple","사과");
        map.put("banana","바나나");

    }
}
