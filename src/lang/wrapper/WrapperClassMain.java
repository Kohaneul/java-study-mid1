package lang.wrapper;

import com.sun.jdi.DoubleValue;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = Integer.valueOf(100); //없어질 예정
        Integer integerObj = Integer.valueOf(100);   //-128~127 자주 사용하는 숫자값 사용. 불변.
        System.out.println(newInteger.toString());
        System.out.println("integerObj = "+integerObj);

        Long longObj = Long.valueOf(100);
        System.out.println("newInteger = "+longObj);
        Double doubleObj = Double.valueOf(0.2);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부값 읽기");
        //wrapper->primitive
        int intValue = integerObj.intValue();   //래퍼클래스의 기본형의 값을 다시 꺼내는 메소드
        long longValue = longObj.longValue();


        System.out.println("비교");
        System.out.println("=="+(newInteger==integerObj));// 객체끼리 비교 -> false
        System.out.println("equals:"+(newInteger.equals(integerObj)));  //객체에 있는 값 비교 ->true
    }
}
