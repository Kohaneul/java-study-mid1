package thread.control.yield;

import static thread.util.ThreadUtils.sleep;

public class YieldMain {
    static final int THREAD_COUNT = 1000;
    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }


    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"-"+i);
                //1.empty
//                sleep(1); //2. sleep : runnable -> timed waiting 으로 변경 1ms 지난 후 실행 스케줄링으로 넣음
                Thread.yield(); //3.yield : 현재 실행중인 스레드가 cpu를 양보하도록
            }
        }
    }
}
