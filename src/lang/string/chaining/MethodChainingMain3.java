package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
       ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();//자기 자신에 계속 접근
        System.out.println("result = " + result);
    }
}
