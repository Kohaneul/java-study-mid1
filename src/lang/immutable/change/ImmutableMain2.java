package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);   //객체가 만들어지기만 하고 반환하지 않으면 gc에 의해 사라짐

        //obj1의 value 값은 변하지 않음
        System.out.println("obj1 = " + obj1);

    }
}
