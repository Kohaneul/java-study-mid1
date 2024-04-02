package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //println 내부에서 obj.toString()을 출력하기때문에 같은 결과값이 나옴
        System.out.println("string = " + string);
        System.out.println("object = " + object);


    }
}
