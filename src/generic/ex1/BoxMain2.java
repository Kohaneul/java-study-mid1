package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(1);
        Integer integer = (Integer)integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String s = (String)stringBox.get();
        System.out.println("s = " + s);

        //잘못된 형태의 인수 전달
        integerBox.set("100");
        integer = (Integer)integerBox.get();
        System.out.println("s = " + s);

    }
}
