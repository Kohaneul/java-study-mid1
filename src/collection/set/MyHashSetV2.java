package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    private Object value;
    private int size = 0;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    private LinkedList<Object>[] buckets;


    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity){
        this.capacity = capacity;
        initBuckets();
    }


    public boolean add(Object t){
        LinkedList<Object> bucket = buckets[hashIndex(t)];
        if(bucket.contains(t)){
            return false;
        }
        else{
            bucket.add(t);
            size++;
            return true;
        }
    }



    private void initBuckets(){
        buckets = new LinkedList[capacity];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public Object getValue() {
        return value;
    }

    private int hashIndex(Object value){
        //음수로 나올 수도 있어서 절대값으로 변경
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean contains(Object searchValue){
        LinkedList<Object> bucket = buckets[hashIndex(searchValue)];
       return bucket.contains(searchValue);
    }

    public boolean remove(Object value){
        LinkedList<Object> bucket = buckets[hashIndex(value)];
        boolean result = bucket.contains(value);
        if(result){
            size--;
            return true;
        }
        else{
            return false;
        }
    }






    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", value=" + value +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
