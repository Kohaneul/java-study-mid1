package collection.deque.test.queue2;

public class SchedulerTest2 {
    public static void main(String[] args) {
        TaskScheduler1 taskScheduler1 = new TaskScheduler1();
        taskScheduler1.addTask(new TaskImpl1());
        taskScheduler1.addTask(new TaskImpl2());
        taskScheduler1.addTask(new TaskImpl3());
        System.out.println("=== 작업 시작 ===");
        run(taskScheduler1);
        System.out.println("=== 작업 종료 ===");


    }

    private static void run(TaskScheduler1 taskScheduler1){
        while(taskScheduler1.getRemainingTask()>0){
            taskScheduler1.processNextTask();
        }
    }
}
