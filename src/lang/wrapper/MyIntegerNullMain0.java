package lang.wrapper;

import lang.object.Parent;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
      int[] intArr = {-1,0,1,2,3};
        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,100));
        //문제 : 값이 있는지, 없는지 확인이 힘들다. (못찾으면 -1로 반환하는데 -1이 존재할경우 -1로 반환)

    }

    private static int findValue(int[] intArr, int target){
        for (int value : intArr) {
            if(value==target) {
                return value;
            }
        }
        return -1;
    }
}
