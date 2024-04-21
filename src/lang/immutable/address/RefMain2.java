package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울"); //a -> x001
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법은 없다. b -> x001
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        System.out.println("b -> 부산");
        //b.setValue("부산");  ->컴파일 오류
        b = new ImmutableAddress("부산");
        System.out.println("b = " + b);
        System.out.println("a = " + a);




    }
}
