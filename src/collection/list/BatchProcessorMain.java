package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        BatchProcessor batchProcessor1= new BatchProcessor(new MyArrayList<>());
        batchProcessor1.logic(50_000);

        BatchProcessor batchProcessor2= new BatchProcessor(new MyLinkedList<>());
        batchProcessor2.logic(50_000);
    }
}
