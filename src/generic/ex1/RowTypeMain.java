package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
//        GenericBox genericBox = new GenericBox();
        GenericBox<Object> genericBox = new GenericBox<>();
        genericBox.set(11);
        Integer intValue = (Integer) genericBox.get();
        System.out.println("intValue = " + intValue);
    }
}
