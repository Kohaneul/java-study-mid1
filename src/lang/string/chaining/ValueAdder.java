package lang.string.chaining;

public class ValueAdder {
    private int value;
    public ValueAdder add(int addValue){
        value+=addValue;
        return this;    //자기자신을 반환
    }

    public int getValue() {
        return value;
    }

//    @Override
//    public String toString() {
//        return "ValueAdder{" +
//                "value=" + value +
//                '}';
//    }
}
