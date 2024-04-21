package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj add(int addValue){
        int result = value+addValue;
        //value의 값은 절대 바꾸지 않고 변화한 값으로 객체 생성됨
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
