package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> dictionaryMap  = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요(종료는 'q') : ");
            String englishWord = sc.next();

            if(englishWord.equals("q")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            String koreanWord = sc.next();

            dictionaryMap.put(englishWord,koreanWord);
        }
        System.out.println();
        System.out.println("==단어 검색 단계==");

        while(true){
            System.out.print("영어 단어를 입력하세요(종료는 'q') : ");
            String searchWord = sc.next();

            if(searchWord.equals("q")){
                System.out.println("프로그램을 종료합니다");
                break;
            }

            if(dictionaryMap.containsKey(searchWord)){
                System.out.println(searchWord+"의 뜻 : "+dictionaryMap.get(searchWord));
            }
            else{
                System.out.println(searchWord+"은(는) 사전에 없는 단어입니다.");
            }
//            System.out.println(dictionaryMap.getOrDefault(searchWord ,searchWord+"은(는) 사전에 없는 단어입니다. "));

        }
    }

}
