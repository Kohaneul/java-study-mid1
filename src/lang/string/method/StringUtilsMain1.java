package lang.string.method;

import java.util.stream.Stream;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str ="Hello, Java!";
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : "+numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolean형의 문자열 값 " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체형의 문자열 값 :  " + objString);
        String numString2 = "" + num;   //문자+숫자 => 문자
        System.out.println("빈문자열 + num = " + numString2);

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
