package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread  = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 thread.interrupt() ");
        thread.interrupt(); //-> Thread는 interrupted 상태가 됨. 스레드와 연관없는 코드는 정상 실행됨 대신, 스레드가 InterruptedException 예외 처리를 해야 하는 코드가 있을 시 걸림 ex) Thread.sleep(1000)
        log(thread.getName()+" 스레드 인터럽트 상태1 =  "+thread.isInterrupted());
    }

    static class MyTask implements Runnable{

        @Override
        public void run() {
            try{
                while(true){
                    log("작업 중");
                    Thread.sleep(3000); //인터럽트 지시-> sleep을 깨운뒤 catch에 걸림
                }
            }
            catch(InterruptedException e){
                log("work 스레드 인터럽트 상태 = "+Thread.currentThread().isInterrupted());
                log("interrupt message="+e.getMessage());
                log("state=  "+Thread.currentThread().getState());
            }
            log("자원 정리");
            log("자원 종료");
        }
    }
}
