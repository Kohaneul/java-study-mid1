package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> numbers = new ArrayList<>();
        while(true) {
            int no = sc.nextInt();
            if (no == 0) {
                break;
            }
            numbers.add(no);
        }
        System.out.println("출력");
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if(i<numbers.size()-1){
                sb.append(", ");
            }

        }
        System.out.println(sb.toString());

    }
}
