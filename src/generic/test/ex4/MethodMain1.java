package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Integer object = (Integer) GenericMethod.objMethod(i);

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(i);
        System.out.println("integer = " + integer);
        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        System.out.println("integer2 = " + integerValue);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        String strValue1 = GenericMethod.<String>genericMethod(String.valueOf(i));

        System.out.println("타입 추론");
        Integer result1 = GenericMethod.numberMethod(i);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
        String strValue2 = GenericMethod.genericMethod(String.valueOf(i));
    }
}
