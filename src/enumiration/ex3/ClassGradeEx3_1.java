package enumiration.ex3;


import enumiration.ex2.ClassGrade;

import static enumiration.ex3.Grade.*;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
      int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        System.out.println("basic = " + basic);
        int diamond = discountService.discount(DIAMOND, price);
        System.out.println("diamond = " + diamond);
        int gold = discountService.discount(GOLD, price);
        System.out.println("gold = " + gold);


    }
}
