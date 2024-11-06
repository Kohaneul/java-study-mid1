package collection.array;

import java.util.Arrays;

public class testMain2 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] arr2= new int[arr.length*2];
        int[] ints = Arrays.copyOf(arr, arr2.length);
        System.out.println(Arrays.toString(ints));
    }
}
