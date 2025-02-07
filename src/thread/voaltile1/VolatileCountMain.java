package thread.voaltile1;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task,"work");
        t.start();

        sleep(1000);

        task.flag=false;
        log("flag="+task.flag+", count = "+task.count+" in main"); //1억번에 1번씩 출렬


    }

    static class MyTask implements Runnable{
//        boolean flag = true;
//        long count;

        volatile boolean flag = true;
        volatile long count;

        @Override
        public void run() {
            while(flag){
                count++;
                if(count%100_000_000==0){
                    log("flag="+flag+", count = "+count+" in while()"); //1억번에 1번씩 출렬
                }
            }
            log("flag="+flag+", count = "+count+" 종료"); //1억번에 1번씩 출렬
        }
    }
}
