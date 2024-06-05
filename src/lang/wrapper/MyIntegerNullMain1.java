package lang.wrapper;

import java.util.Arrays;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
      MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1)};
        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,100));
        //문제 : 값이 있는지, 없는지 확인이 힘들다. (못찾으면 -1로 반환하는데 -1이 존재할경우 -1로 반환)

    }

    private static MyInteger findValue(MyInteger[] intArr, int target){
        for (MyInteger myInteger : intArr) {
            if(myInteger.getValue()==target){
                return myInteger;
            }
        }
        return null;
    }
}
