package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class ThreadStopMainV3 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread  = new Thread(task, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시 thread.interrupt() ");
        thread.interrupt(); //-> Thread는 interrupted 상태가 됨. 스레드와 연관없는 코드는 정상 실행됨 대신, 스레드가 InterruptedException 예외 처리를 해야 하는 코드가 있을 시 걸림 ex) Thread.sleep(1000)
        log(thread.getName()+" 스레드 인터럽트 상태1 =  "+thread.isInterrupted());
    }

    static class MyTask implements Runnable{

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                //인터럽트 상태를 변경하지는 않음. 단순 상태확인 용
                log("작업 중");
            }
            log("work 스레드 인터럽트 상태2 = "+Thread.currentThread().isInterrupted());
            try{
                log("자원 정리");
                Thread.sleep(1000);
                log("자원 종료");
            }
            catch(InterruptedException e){
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태3 = "+Thread.currentThread().isInterrupted());
            }
            log("자원 종료");

        }
    }
}
