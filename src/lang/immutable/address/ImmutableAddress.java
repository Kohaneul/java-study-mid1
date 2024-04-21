package lang.immutable.address;

public class ImmutableAddress {
    private final String value; //한번 생성자에서 생성하고 나면 값 변경이 불가함.

    public ImmutableAddress(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
