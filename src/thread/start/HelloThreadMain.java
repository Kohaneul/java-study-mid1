package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread(); //메인 스레드
        System.out.println(thread.getName() + " : main() start");

        HelloThread helloThread = new HelloThread();    //메인스레드에서 HelloThread 인스턴스 생성
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        helloThread.start();    //HelloThread stack 할당 받음
        //메인스레드는 바로 빠져나옴
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");
        System.out.println(thread.getName() + " : main() end");


    }
}
