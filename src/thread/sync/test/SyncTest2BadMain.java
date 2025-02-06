package thread.sync.test;

import static java.lang.Thread.sleep;
import static thread.util.MyLogger.log;

public class SyncTest2BadMain {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    myCounter.count();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(task,"Thread-1");
        Thread thread2 = new Thread(task,"Thread-2");
        thread1.start();
        thread2.start();

    }


    static class MyCounter{
        //java 클래스에서 지역변수는 stack 영역에서 관리해서 멀티 스레드 환경에서 값이 공유가 안되는데 멤버변수는 heap에서 관리해서 synchronized를 사용하지 않는 이상 스레드에서 값이 공유가 되어 동시성이슈가 발생
        public synchronized void count() throws InterruptedException {
            int localValue = 0;
            for(int i = 0; i<1000;i++){
                localValue = localValue+1;
            }
            sleep(100);
            log("결과 : "+localValue);
        }


    }
}
