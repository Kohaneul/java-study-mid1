package thread.sync.test;

public class Immutable {
    private final int value;    //final은 변경 불가 : 여러 스래드가 접근해도 문제가 생기지 않음

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
