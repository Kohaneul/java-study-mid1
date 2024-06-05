package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        int value = 7 ;

        //기본형의 7을 Integer이라는 박스에 담음
        Integer boxedValue = Integer.valueOf(7);
        System.out.println("boxedValue = " + boxedValue);
        //wrapper -> primitive 로 변경
        int unBoxedValue = boxedValue.intValue();
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
