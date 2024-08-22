package lang.wrapper.test;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);   //숫자 -> wrapper 클래스로 변환
        System.out.println("i1 = " + i1);
        Integer i2 = Integer.valueOf("10");
        System.out.println("i2 = " + i2);
        int intValue = Integer.parseInt("10");
        System.out.println("intValue = " + intValue);

        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //산술연산
        System.out.println("sum = " + Integer.sum(10,20));
        System.out.println("min = " + Integer.min(10,20));
        System.out.println("max = " + Integer.max(10,20));

    }
}
