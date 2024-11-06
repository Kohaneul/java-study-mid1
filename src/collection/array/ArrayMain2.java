package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        //배열의 첫번재 위치에 추가
        int[]arr  = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println( Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        //기존 배열을 한칸씩 밀고 배열의 첫번째 위치에 추가
        int newValue =3;
        System.out.println("연산의 첫번째 위치에 3 추가 O(n)");
        addFirst(arr,newValue);
        System.out.println( Arrays.toString(arr));

        //index 위치에 추가
        //기존 배열을 한칸씩 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr,index,value);
        System.out.println( Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr,5);
        System.out.println( Arrays.toString(arr));


    }

    private static void addLast(int[] arr, int value) {
        arr[arr.length-1] = value;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        int len = arr.length-1;

        //3,1,2,0,0 -> 3,1, 4,2,0
        //4 <-3
        //3 <-2
        //2 <-value
        for(int i = len-1; i>index;i--){
            arr[i] = arr[i-1];
        }

        arr[index] =value;
    }

    private static void addFirst(int[] arr, int newValue) {
        int len = arr.length-1;
        for(int i = len-1; i>0;i--){
            arr[i] = arr[i-1];
        }

        arr[0] =newValue;
    }
}
