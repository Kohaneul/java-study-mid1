package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        //입력 : 1,2,5,8
        //[null, 1, 2, null, null, 5, null, null, 8, null]
       Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        int searchValue = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        System.out.println("result= "+inputArray[searchValue]);//O(1)
    }
}
