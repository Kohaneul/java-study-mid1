package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();    //생성시점에 T의 타입 결정
        integerBox.set(11); //Integer 타입만 허용 -> 컴파일오류
        System.out.println("integerGenericBox = " + integerBox.get());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        System.out.println("stringGenericBox.get() = " + stringBox.get());

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(0.1);
        System.out.println("doubleBox = " + doubleBox.get());

        //타입 추론 : 생성하는 제너릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
