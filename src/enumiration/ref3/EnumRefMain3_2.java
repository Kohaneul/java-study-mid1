package enumiration.ref3;

import static enumiration.ref3.Grade.*;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC  = " + BASIC.discount(price));
        System.out.println("GOLD  = " + GOLD.discount(price));
        System.out.println("DIAMOND  = " + DIAMOND.discount(price));


    }
}
