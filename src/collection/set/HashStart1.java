package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
       Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        int searchValue = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        for (Integer inputValue : inputArray) {
            if(inputValue==searchValue){
                System.out.println(inputValue);
            }
        }
    }
}
