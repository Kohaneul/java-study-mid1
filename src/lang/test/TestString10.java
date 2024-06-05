package lang.test;

import java.util.Arrays;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        String joinedString = String.join("->", split);
        System.out.println("join = " + joinedString);


    }
}
