package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;
    public Printer process(int paramVar){
        int localVar = 1;   //지역변수는 스택 프레임이 종료되는 순간 종료된다.

        class LocalPrinter implements Printer{
            int value = 0;


            @Override
            public void print() {
                //자기자신의 멤버변수에 접근
                System.out.println("value = "+value);

                //인스턴트는 지역변수보다 더 오래 살아 남는다.
                System.out.println("localVar"+localVar);
                System.out.println("paramVar = "+paramVar);

                //바깥클래스 지역변수 출력
                System.out.println("outInstanceVar = "+outInstanceVar);
            }
        }

        Printer print = new LocalPrinter();

//        localPrinter.print();를 실행하지 않고 인스턴스만 반환한다.
        return print;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(1);

        //print를 나중에 실행한다. process의 스택프레임이 사라진 이후에 작동
        printer.print();

        //필드확인
        Field[] fields = printer.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
