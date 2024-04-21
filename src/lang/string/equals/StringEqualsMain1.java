package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = "hello1";//문자열 풀에 보관 후 참조
        String str2 = "hello1";//문자열풀에 보관2 후 참조
        System.out.println("new String() 비교 "+(str1==str2));//인스턴스 비교를 하므로 다름
        //문자열 풀에 있는 내용을 비교
        System.out.println("new String() equals 비교 "+(str1.equals(str2)));
        //equals -> String 안에 있는 byte 객체를 활용하여 문자 내용을 비교

    }
}
