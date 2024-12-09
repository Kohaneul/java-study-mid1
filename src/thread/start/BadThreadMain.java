package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread(); //메인 스레드
        System.out.println(thread.getName() + " : main() start");

        HelloThread helloThread = new HelloThread();    //메인스레드에서 HelloThread 인스턴스 생성
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        helloThread.run();    // 메인스레드가 직접 실행함 -> 반드시 start()를 해줘야지 별도의 스택공간이 생김
        //메인스레드는 바로 빠져나옴
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");
        System.out.println(thread.getName() + " : main() end");


    }
}
