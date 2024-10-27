package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토박싱
        System.out.println("integerBox = " + integerBox.get());

        StringBox stringBox = new StringBox();
        stringBox.set("hellor");
        System.out.println("stringBox = "+stringBox.get());
    }
}
