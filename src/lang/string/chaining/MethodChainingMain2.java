package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);   //자기자신 반환 adder == adder1
        ValueAdder adder2 = adder1.add(2);  //자기자신 반환 adder1 == adder2
        ValueAdder adder3 = adder2.add(3);  //자기자신 반환 adder2 == adder3
        int result = adder3.getValue();
        System.out.println("result = " + result);
        System.out.println("adder = " + adder);
        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);

    }
}
