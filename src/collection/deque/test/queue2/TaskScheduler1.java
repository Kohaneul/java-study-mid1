package collection.deque.test.queue2;

import collection.deque.test.queue.Task;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler1 {
    private Queue<Task2> tasks;

    public TaskScheduler1() {
        tasks = new ArrayDeque<>();
    }

    public void addTask(Task2 task){
        tasks.offer(task);
    }

    public void processNextTask(){
        Task2 task = tasks.poll();
        if(task!=null){
            task.execute();
        }
    }

    public int getRemainingTask(){
        return tasks.size();
    }
}
