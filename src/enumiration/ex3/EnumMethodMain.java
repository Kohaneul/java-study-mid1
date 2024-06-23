package enumiration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        //모든 Enum 반환
        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println("name = " + value.name()+", ordinal = "+value.ordinal());
        }


        //String -> ENUM 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("grade = " + gold);

    }

}
