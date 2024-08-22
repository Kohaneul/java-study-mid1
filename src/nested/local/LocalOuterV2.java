package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;
    public void process(int paramVar){
        int localVar = 1;
        class LocalPrinter{
            int value = 0;
            public void printData(){

                //자기자신의 멤버변수에 접근
                System.out.println("value = "+value);

                //지역변수 접근
                System.out.println("localVar"+localVar);
                System.out.println("paramVar = "+paramVar);

                //바깥클래스 지역변수 ㅜㄹ력
                System.out.println("outInstanceVar = "+outInstanceVar);
            }

        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1  localOuterV1 = new LocalOuterV1();
        localOuterV1.process(1);
    }
}
