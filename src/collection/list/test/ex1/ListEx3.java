package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while(true){
            int no = sc.nextInt();
            if(no==0){
                break;
            }
            arr.add(no);
        }

        int sum = arr.stream().mapToInt(Integer::intValue).sum();
        double avg = (double) sum /arr.size();
        System.out.println("입력한 정수의 합계 = " + sum);
        System.out.println("입력한 정수의 평균 = "+avg);
    }
}
