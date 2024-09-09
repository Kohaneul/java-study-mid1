package nested.anonymous.ex;

import lang.math.RandomMain;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(){

        //코드 조각 시작
        print(6);

        //코드 조각 종료

    }

    public static void helloSum(){

        //코드 조각 시작
        print(3);

        //코드 조각 종료
    }

   public static void print(int no){
       System.out.println("프로그램 시작");
        if(no ==6){
            int randomValue = new Random().nextInt(no) + 1;
            System.out.println("주사위 = " + randomValue);
        }
        else if(no ==3){
            for(int i = 0; i<no;i++){
                System.out.println("i = " + i);
            }
        }

       System.out.println("프로그램 종료");
   }


    public static void main(String[] args) {
        helloDice();
        System.out.println();
        helloSum();
    }
}
