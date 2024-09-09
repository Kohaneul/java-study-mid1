package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    //인스턴스를 던지고 인스턴스를 오버라이드 하는 메서드를 호출한다.
    static void process(Process process){
        System.out.println("프로그램 시작");

        process.run();
        System.out.println("프로그램 종료");

    }






    public static void main(String[] args) {
        //메인메서드 안에서만 쓰기 떄문에 지역클래스로 만든다.
       Process dice = new Process(){
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);

            }
        };

       Process sum = new Process(){
            @Override
            public void run() {
                for(int i = 0; i<3;i++){
                    System.out.println("i = " + i);
                }
            }
        };
       process(dice);
       process(sum);

    }
}
