package thread.control;

import thread.util.ThreadUtils;

public class CheckedExceptionMain {
    public static void main(String[] args) {
    }

    static class CheckedRunnable implements Runnable{

        @Override
        public void run() /* throws Exception */{
//            throw new Exception();
            ThreadUtils.sleep(1000);
        }
    }
}
