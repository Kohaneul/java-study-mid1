package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format 메서드
        String format1 = String.format("num : %d, bool : %b , str : %s", num, bool, str);
        System.out.println("format = " + format1);

        String format2 = String.format("숫자 : %.2f", (float)num);
        System.out.println("format2 = " + format2);

        System.out.printf("숫자 : %.2f\n", 10.12334);

        //match 메서드
        String regex = "Hello, (Java!|World)"; //Java! 나 World 가 들어오면 true로 반환
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));

    }
}
