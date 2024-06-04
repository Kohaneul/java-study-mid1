package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        //String 객체가 여러개 생기면 컴파일러가 최적화 시키려고 노력하지만
        //반복문에서는 아직 최적화 불가 > String 객체가 loop 횟수만큼 생성됨
        for(int i = 0; i<10000;i++){
            result+="Hello Java ";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime-startTime)+"ms");
    }
}
