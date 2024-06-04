package lang.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int idx = str.indexOf(".txt");
        String hello = str.substring(0, idx);
        System.out.println("hello = " + hello);
        String txt = str.substring(idx);
        System.out.println("txt = " + txt);


    }
}
