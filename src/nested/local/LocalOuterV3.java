package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;
    public void process(int paramVar){
        int localVar = 1;
        class LocalPrinter implements Printer{
            int value = 0;


            @Override
            public void print() {
                //자기자신의 멤버변수에 접근
                System.out.println("value = "+value);

                //지역변수 접근
                System.out.println("localVar"+localVar);
                System.out.println("paramVar = "+paramVar);

                //바깥클래스 지역변수 출력
                System.out.println("outInstanceVar = "+outInstanceVar);
            }
        }

        Printer localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(1);
    }
}
