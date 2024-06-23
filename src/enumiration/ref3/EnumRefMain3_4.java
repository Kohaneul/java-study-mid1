package enumiration.ref3;

import static enumiration.ref3.Grade.*;

public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 10000;
        for (Grade value : values()) {
            printDiscount(value,price);

        }

    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name()+" = " + grade.discount(price));

    }
}
