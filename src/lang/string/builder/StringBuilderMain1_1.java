package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);
        sb.insert(4,"Java") ;//4번째에 Java 라는 문자열을 넣어라
        System.out.println("insert = " + sb);
        sb.delete(4,8);//4부터 8까지 지워라
        System.out.println("delete = " + sb);
        sb.reverse();//문자열 거꾸로
        System.out.println("reverse = " + sb);
        //StringBuilder -> String (가변 -> 불변)
        String string = sb.toString();
        System.out.println("string = " + string);

    }
}
