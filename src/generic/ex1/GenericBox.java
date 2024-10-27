package generic.ex1;

public class GenericBox<T>{

    //T : 타입 매개변수 > GenericBox가 객체생성할때 인자로부터 타입이 결정됨

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
