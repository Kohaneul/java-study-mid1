package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    //인스턴스를 던지고 인스턴스를 오버라이드 하는 메서드를 호출한다.
    static void process(Process process){
        System.out.println("프로그램 시작");

        process.run();
        System.out.println("프로그램 종료");

    }

    static class Dice implements Process{

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);

        }
    }

    static class Sum implements Process{

        @Override
        public void run() {
            for(int i = 0; i<3;i++){
                System.out.println("i = " + i);
            }
        }
    }




    public static void main(String[] args) {
        System.out.println(" Hello 실행");
        process(new Dice());
        process(new Sum());



    }
}
