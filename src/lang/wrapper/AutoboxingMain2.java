package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7 ;
        //기본형의 7을 Integer이라는 박스에 담음
        Integer boxedValue = value; //컴파일단계에서 알아서 해준다.
        System.out.println("boxedValue = " + boxedValue);
        //wrapper -> primitive 로 변경
        int unBoxedValue = boxedValue;
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
