package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV3 <E> implements MySet<E>{
    private E value;
    private int size = 0;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    private LinkedList<E>[] buckets;


    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity){
        this.capacity = capacity;
        initBuckets();
    }


    public boolean add(E t){
        LinkedList<E> bucket = buckets[hashIndex(t)];
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

    public E getValue() {
        return value;
    }

    private int hashIndex(E value){
        //음수로 나올 수도 있어서 절대값으로 변경
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean contains(E searchValue){
        LinkedList<E> bucket = buckets[hashIndex(searchValue)];
       return bucket.contains(searchValue);
    }

    public boolean remove(E value){
        LinkedList<E> bucket = buckets[hashIndex(value)];
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyHashSetV3<?> that = (MyHashSetV3<?>) o;

        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "value=" + value +
                ", size=" + size +
                ", capacity=" + capacity +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
