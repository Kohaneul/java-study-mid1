package generic.test.ex5;

public class Family<T extends Parent>{
    private T t;

    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public void printInfo(){
        System.out.println("t = " + t);
    }



}
