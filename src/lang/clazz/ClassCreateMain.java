package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass = Class.forName("lang.clazz.Hello");
        //생성자를 선택하고 생성된 생성자를 기반으로 인스턴스 생성한다.
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
